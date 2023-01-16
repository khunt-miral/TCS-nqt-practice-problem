import java.util.HashMap;
import java.util.Map;

// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	       5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	            5 occurs 2 times in the array
//              15 occurs 1 time in the array
public class Freq {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        freq(arr);
    }    
    static void freq(int [] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i : arr) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> ele : map.entrySet()) {
            System.out.println(ele.getKey() + " " +ele.getValue());
        }
    }
}
