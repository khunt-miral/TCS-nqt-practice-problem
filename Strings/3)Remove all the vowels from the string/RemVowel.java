// Input: Str = “take u forward”
// Output: tk  frwrd
// Explanation: All vowels are removed from the given String.

public class RemVowel {
    public static void main(String[] args) {
        String str = "I am very happy today";
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(!(c == 'a' ||c == 'e'|| c == 'i' ||c == 'o' ||c == 'u')) {
                sb.append(c);
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
