// Input Format: N = 25
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

public class Automorphic {
    public static void main(String[] args) {
        int n = 26;
        if(automo(n)) System.out.print("Automorphic");
        else System.out.println("Not Automorphic");
    }

    static boolean automo(int n) {
        int square = n * n;
        while(n != 0) {
            if(n % 10 != square % 10) {
                return false;
            }
            n/=10;
            square/=10;
        }
        return true;
    }
}
