// Input: [1,2,4,7,7,5]
// Output: Second Smallest : 2
// 	Second Largest : 5
// Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

public class Sec {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 7, 7, 5 };
        int smin = secondMin(array);
        int smax = secondLargest(array);
        System.out.println("Second min is: " + smin);
        System.out.println("Second max is:" + smax);
    }

    static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {                              //1,2,4,7,7,5
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    static int secondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
}
