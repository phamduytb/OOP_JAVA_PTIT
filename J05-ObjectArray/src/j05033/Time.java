package j05033;

public class Time implements Comparable<Time>{

    private int hours, minute, second;

    public Time(int hours, int minute, int second) {
        this.hours = hours;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(Time o) {
        if (this.hours > o.hours) return 1;
        else if (this.hours == o.hours && this.minute > o.minute) {
            return 1;
        } else if (this.hours == o.hours && this.minute == o.minute &&
                    this.second > o.second) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return hours + " " + minute + " " + second;
    }
}
