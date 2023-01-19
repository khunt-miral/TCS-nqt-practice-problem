// Input: arr[1,1,2,2,2,3,3]
// Output: arr[1,2,3,_,_,_,_]
// Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore 
// return 3 after assigning [1,2,3] in the beginning of the array.

public class Remdup {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3,3,3,3,4,4};
        int k = deplicate(arr);
        for(int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
        
    }
    static int deplicate(int [] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

}
