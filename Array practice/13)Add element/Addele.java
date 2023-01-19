// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)
// Output: 6,1,2,8,3,4,5,7
// Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 

public class Addele {
    public static void main(String[] args) {
        int N = 7, array[] = { 1, 2, 3, 4, 5, 0, 0, 0 };
        insertatEnd(array, N, 7);
        insertatbegin(array, N, 6);
        insertatposition(array, N, 8, 4);
    }

    static void insertatbegin(int[] arr, int n, int value) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }

    static void insertatEnd(int[] arr, int n, int value) {
        arr[n] = value;
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }

    static void insertatposition(int[] arr, int n, int value, int pos) {
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = value;
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }
}
