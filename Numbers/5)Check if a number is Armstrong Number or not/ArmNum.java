// Input:153 
// Output: Yes, it is an Armstrong Number
// Explanation: 1^3 + 5^3 + 3^3 = 153

//This code is for 3 digits only
public class ArmNum {
    public static void main(String[] args) {
        int n = 170;
        boolean k = arm(n);
        if(k == true) {
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
    static boolean arm(int n) {
        int ans = 0;
        int num = n;
        while(n != 0) {
            int rem = n % 10;
            int digit = (int)Math.pow(rem,3);
            ans += digit;
            n /= 10;
        }
        return ans == num;
    }
}
