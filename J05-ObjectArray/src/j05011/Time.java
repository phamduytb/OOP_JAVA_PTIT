package j05011;

public class Time implements Comparable<Time>{
    private String code, player, totalTime;

    public Time(String code, String player, String timeIn, String timeOut) {
        this.code = code;
        this.player = player;
        this.totalTime = playTime(timeIn, timeOut);
    }

    private String playTime (String timeIn, String timeOut) {
        String s1[] = timeIn.split(":");
        String s2[] = timeOut.split(":");
        int h = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
        if (m < 0) {
            m += 60;
            h--;
        }
        return h + " gio " + m + " phut";
    }


    @Override
    public int compareTo(Time o) {
        String s1[] = this.totalTime.split(" ");
        String s2[] = o.totalTime.split(" ");
        if (Integer.parseInt(s1[0]) < Integer.parseInt(s2[0]))  return 1;
        if (Integer.parseInt(s1[0]) == Integer.parseInt(s2[0]) &&
                Integer.parseInt(s1[2]) < Integer.parseInt(s2[2]))  return 1;
        return -1;
    }

    @Override
    public String toString() {
        return code + " " + player + " " + totalTime;
    }
}
