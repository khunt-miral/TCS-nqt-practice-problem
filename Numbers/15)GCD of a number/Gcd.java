// Input: num1 = 4, num2 = 8
// Output: 4
// Explanation: Since 4 is the greatest number which divides both num1 and num2.

public class Gcd {
    public static void main(String[] args) {
        int a = 4, b = 8;
        int k = gcd(a,b);
        System.out.println(k);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
