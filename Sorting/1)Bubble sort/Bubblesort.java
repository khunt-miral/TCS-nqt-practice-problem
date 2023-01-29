// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: After sorting we get 9,13,20,24,46,52

public class Bubblesort {
    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};
        bubble(array);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    static void bubble(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
