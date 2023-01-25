// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

public class StrongNum {
    public static void main(String[] args) {
        int n = 26, dum = n;
        long sum = 0;
        long ans = 0;

        while(n != 0) {
            int rem = n % 10;
            ans = fact(rem);
            sum += ans;
            n /= 10;
        }

        if(sum == dum) System.out.println("Yes");
        else System.out.println("No");
    }

    static long fact(int n) {
        int tmp = 1;
       for(int i = 1; i <= n; i++) {
           tmp *= i;
       }
       return tmp;
    }
}
