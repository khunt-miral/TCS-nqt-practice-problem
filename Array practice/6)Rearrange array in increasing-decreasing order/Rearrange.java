import java.util.Arrays;

// Input: 8 7 1 6 5 9
// Output: 1 5 6 9 8 7
// Explanation: First three elements are in the ascending order and next three elements are in the descending order.

public class Rearrange {
    public static void main(String[] args) {
        int [] arr = {4,2,8,6,15,5,9,20};
        Arrays.sort(arr);
        int start = (arr.length/2);
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
