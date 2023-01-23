// Input: min = 10 , max = 50
// Output: 11 22 33 44 
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.


public class PalNumInRange {
    public static void main(String[] args) {
        int min = 100, max = 150;
        for(int i = min; i <= max; i++) {
            if(isPalindrome(i) == true) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
}
