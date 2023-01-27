// Example 1:
// Input: num1 = 4,num2 = 8
// Output: 8

public class Lcm {
    public static void main(String[] args) {
        int a = 4, b = 8;
        int d = gcd(a,b);
        int lcm = a * b / d;
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
