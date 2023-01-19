import java.security.KeyStore.Entry;
import java.util.HashMap;

// Input: 
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
//  1,2,4
// Explanation:
//  1,2 and 4 are the elements which are occurring more than once.

public class RepetedEle {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
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
            if (ent.getValue() > 1)
                System.out.println(ent.getKey());
        }
    }
}
