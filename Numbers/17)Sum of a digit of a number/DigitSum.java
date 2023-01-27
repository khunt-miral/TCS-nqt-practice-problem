// Input: N = 472
// Output: 13
// Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

public class DigitSum {
    public static void main(String[] args) {
        int n = 102, sum = 0;
        while(n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
