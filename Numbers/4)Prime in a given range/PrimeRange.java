// Input: 2 10
// Output: 2 3 5 7 
// Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

public class PrimeRange {
    public static void main(String[] args) {
        int start = 2, end = 200;
        while (start < end) {
            if (isPrime(start) == true) {
                System.out.print(start + " ");
            }
            start++;
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
