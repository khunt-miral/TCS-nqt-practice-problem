// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

public class NSum {
    public static void main(String[] args) {
        int n = 5;
        int ans = (n * (n+1)) / 2;
        System.out.println(ans);
    }
}
