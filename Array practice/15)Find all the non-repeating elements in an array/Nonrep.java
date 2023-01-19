import java.util.HashMap;

// Input:
//  Nums = [1,2,-1,1,3,1]
// Output:
//  2,-1,3
// Explanation:
//  1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

public class Nonrep {
    public static void main(String[] args) {
        int [] arr = {1,2,-1,1,3,1};
        duplicate(arr);
    }
    static void duplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        for (java.util.Map.Entry<Integer, Integer> ent : map.entrySet()) {
            if (ent.getValue() == 1)
                System.out.println(ent.getKey());
        }
    }
}
