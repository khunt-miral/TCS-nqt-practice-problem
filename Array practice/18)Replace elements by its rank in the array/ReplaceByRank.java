import java.util.Arrays;
import java.util.HashMap;

// Input: 20 15 26 2 98 6
// Output: 4 3 5 1 6 2
// Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…


public class ReplaceByRank {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6};
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] dummy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            dummy[i] = arr[i];
        }

        Arrays.sort(dummy);

        for(int i = 0; i < dummy.length; i++) {
            if(map.get(dummy[i]) == null) {
                map.put(dummy[i],  rank);
                rank++;
            }
        }
        
        for(int i : arr) {
            System.out.print(map.get(i)+ " ");
        }
    }
}
