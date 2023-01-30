// Input: string str=”India won the cricket match”
// Output:
// Vowels: 8
// Consonants: 15
// White spaces: 4

public class Counter {
    public static void main(String[] args) {
        String str = "India won the cricket match";
        int vowel = 0, consonants = 0, space = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
                vowel++;
            }else if(ch >= 'a' && ch <= 'z') consonants++;
            else if(ch == ' ') space++;
        }
        System.out.print("Vowel =" + vowel+"\n"+"Consonant=" + consonants+"\n"+"space="+space+"\n");
    }
}
