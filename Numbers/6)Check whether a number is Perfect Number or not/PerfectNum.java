// Input: n=6
// Output: 6 is a perfect number

public class PerfectNum {
    public static void main(String[] args) {
        int n = 29;
        boolean k = factors(n);
        if(k) {
            System.out.println("Perfect number");
        }else {
            System.out.println("Not perfect");
        }
    }

    static boolean factors(int n) {
        int sum = 1;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) sum += i;
        }
        if(sum == n) return true;
        else return false;
    }
}
