import java.util.Arrays;

// Input: [2,4,1,3,5]
// Output: 3

public class Median {
    public static void main(String[] args) {
        int [] arr = {4, 7, 1, 2, 5, 6};
        int n = arr.length;
        Arrays.sort(arr);
        if(n % 2 == 0) {
            int fterm = n / 2;
            int sterm = (n / 2) - 1;
            System.out.println((double)(arr[fterm] + arr[sterm]) / 2);
        }else {
            System.out.println(arr[n / 2]);
        }
    }
}
