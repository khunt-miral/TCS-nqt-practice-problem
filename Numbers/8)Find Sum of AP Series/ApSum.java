// Input:
// n=4
// a=2
// d=2
// Output: 20
// Explanation: 2+4+6+8 = 20

public class ApSum {
    public static void main(String[] args) {
        int n = 4, a = 2, d = 2;
        int ans = (n/2)*(2*a+(n-1)*d);
        System.out.println(ans);
    }
}
