// Input: N = 12
// Output: 2,2,3
// Explanation: These are the prime factors of 12.


class PrimeFactors {
    public static void main(String[] args) {
        int n = 12;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    System.out.print(i+" ");
                    n /= 2;
                }
            }
        }        
    }
}