// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 3
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

public class Avg {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int totalEle = array.length, sum = 0;
        for(int i : array) {
            sum += i;
        }
        long ans = (sum / totalEle);
        System.out.println(ans);
    }    
}
