public class Insertionsort {
    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};
        sort(array);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }   
    static void sort(int [] arr) {
        int n = arr.length;
        for(int i = 1; i < n ; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > tmp) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = tmp;
        }
    } 
}