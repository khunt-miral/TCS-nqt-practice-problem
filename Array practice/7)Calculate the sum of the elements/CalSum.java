// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 15
// Explanation: Sum of all the elements is 1+2+3+4+5 = 15

public class CalSum {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}
