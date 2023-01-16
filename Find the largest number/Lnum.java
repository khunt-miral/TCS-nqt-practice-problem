import java.util.Scanner;

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 5
// Explanation: 5 is the largest element in the array. 

public class Lnum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many elements do you want to enter");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element is :");
        int max = arr[0];
        for(int i : arr) {
            if(i > max) max = i;
        }
        System.out.println(max);
    }
}
