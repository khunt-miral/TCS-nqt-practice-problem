// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position.

public class Rotate {
    public static void main(String[] args) {
        int array[] = {3,7,8,9,10,11}, n = 6, k = 3;
        reverse(array, 0, array.length -1);
        reverse(array, 0, k-1);
        reverse(array, k, n-1);
        for(int i : array) {
            System.out.print(i + " ");
        }        
    }   
    static void reverse(int [] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// 7 6 5 4 3 2 1
// 6 7 1 2 3 4 5
