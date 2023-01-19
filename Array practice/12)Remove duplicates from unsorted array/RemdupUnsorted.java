
import java.util.HashSet;

// Input: arr[]={2,3,1,9,3,1,3,9}
// Output:  {2,3,1,9}
// Explanation: Removed all the duplicate elements

public class RemdupUnsorted {
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        remdup(arr,arr.length);
    }

    static void remdup(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            if(!set.contains(i)){
                System.out.print(i+" ");
                set.add(i);
            }
        }
    }
}
