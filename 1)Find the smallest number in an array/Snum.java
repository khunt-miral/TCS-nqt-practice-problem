import java.util.Scanner;

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array. 

public class Snum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many elements do you want to enter");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest element is :");
        int min = arr[0];
        for(int i : arr) {
            if(i < min) min = i;
        }
        System.out.println(min);
    }
}
