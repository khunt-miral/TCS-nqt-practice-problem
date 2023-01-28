// Input: N = 102003
// Output: 112113
// Explanation: The 2nd,4th and 5th position from left contain 0.
// The resultant integer has replaced the 0’s in those  positions with 1.

public class ZeroToOne {
    public static void main(String[] args) {
        int n = 00000;
        int k = replace(n);
        System.out.println(k);
    }

    static int replace(int n) {
        if (n == 0)
            return 1;
        int ans = 0, temp = 1;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 0) {
                digit = 1;
            }
            ans = digit * temp + ans;
            temp = temp * 10;
            n /= 10;
        }
        return ans;
    }
}
