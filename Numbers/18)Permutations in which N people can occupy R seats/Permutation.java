// Input: N = 5, r = 3
// Output: 60
// Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

public class Permutation {
    public static void main(String[] args) {
        int n = 5, r = 5;
        long ans = permute(n)/permute(n-r);
        System.out.println(ans);
    }
    static long permute(int a) {
        if(a <= 1) return 1;
        return a * permute(a-1);
    }
}
