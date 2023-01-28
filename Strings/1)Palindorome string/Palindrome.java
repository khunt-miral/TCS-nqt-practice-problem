// Input: Str =  “ABCDCBA”
// Output: Palindrome
// Explanation: String when reversed is the same as string.

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdcba";
        StringBuilder sb = new StringBuilder(s);
        
        if(s.equals(sb.reverse().toString())) {
            System.out.println("Palindorme");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
