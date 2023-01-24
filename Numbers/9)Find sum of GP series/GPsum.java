// Input: a=1 , r=0.5 , n=3
// Output: 1.75
// Explanation: The sum of given GP Series is 1.75

public class GPsum {
    public static void main(String[] args) {
        double a = 1, r = 0.5, n = 3;
        double ans = a * (Math.pow(r,n) - 1)/ (r - 1);  // a(r^n - 1)/ r - 1
        System.out.println(ans);
    }
}
