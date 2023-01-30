// Input: str = “How are you doing”
// Output: Howareyoudoing
// Explanation: After removing all the whitespaces Howareyoudoing is the result

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "How are you doing";
        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
