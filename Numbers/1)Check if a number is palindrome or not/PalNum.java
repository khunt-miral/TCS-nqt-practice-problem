// Input: N = 123
// Output: Not Palindrome Number
// Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.
public class PalNum {
    public static void main(String[] args) {
        int n = 121;
        pal(n);
    }

    static void pal(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Number is not palindrome");
                return;
            }
        }
        System.out.println("Number is  palindrome");
    }
}
