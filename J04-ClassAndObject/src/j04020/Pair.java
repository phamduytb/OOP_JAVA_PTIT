package j04020;

public class Pair {
    private int fist, second;

    public Pair(int fist, int second) {
        this.fist = fist;
        this.second = second;
    }

    public Boolean prime(int n) {
        if(n < 2)   return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)   return false;
        }
        return true;
    }

    public Boolean isPrime() {
        if(prime(fist) && prime(second))    return true;
        return false;
    }

    @Override
    public String toString() {
        return fist + " " + second;
    }
}
