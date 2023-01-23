// Input: N = 3
// Output: Prime
// Explanation: 3 is a prime number

public class Prime {
    public static void main(String[] args) {
        int n = 13;
        if(prime(n)) {
            System.out.print("Prime");
        }else {
            System.out.print("Not prime");
        }
    }
    static boolean prime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
