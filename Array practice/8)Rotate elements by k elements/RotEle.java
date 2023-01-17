// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

public class RotEle {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 }, k = 2, n = 5;
        blockSwap(array, 0, k, n);  
        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    static void blockSwap(int[] arr, int start, int k, int n) {
        if (k == 0 || k == n)
            return;
        if(k == n - k) {
            swap(arr,start,n-k+start,k);
            return;
        }else if(k < n - k) {
            swap(arr, start, n - k + start, k);
            blockSwap(arr, start, k, n-k);
        }else {
            swap(arr, start, k, n - k);
            blockSwap(arr, n - k + start, 2 * k - n, k);
        }
    }

    static void swap(int[] arr, int start, int end, int k) {
        for(int i = 0; i < k; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end + i];
            arr[end + i] = temp;
        }
    }
}
