// Input: N = 2746
// Output: Largest digit: 7
//         Smallest digit: 2
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

public class MinMaxNum {
    public static void main(String[] args) {
        int n = 1234, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while(n != 0) {
            int digit = n % 10;
            if(digit > max) max = digit;
            if(digit < min) min = digit;
            n /= 10;
        } 
        System.out.println(min+" "+ max);
    }
}
