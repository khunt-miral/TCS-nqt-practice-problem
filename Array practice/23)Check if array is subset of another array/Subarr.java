import java.util.HashSet;

// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [2,4,3,1,7,5,15]
// Output: arr1[] is a subset of arr2[]

public class Subarr {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5, 2 };
        int arr2[] = { 2, 4, 3};
        int k = sub(arr1,arr2);
        if(k == 0){ 
            System.out.print("arr1[] is not a subset of arr2[]");
        }
        else {
            System.out.print("arr1[] is a subset of arr2[]");
        }
    }

    static int sub(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr2) {
            set.add(i);
        }
        for (int i : arr1) {
            if (!set.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
}
