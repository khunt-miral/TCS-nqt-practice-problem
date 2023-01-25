// Input: N = 472
// Output: 274
// Explanation: Reading the number from back to front, we see that the output should be 274

public class RevNum {
    public static void main(String[] args) {
        int n = 472, ans = 0;
        while(n != 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        System.out.println(ans);
    }
}
