import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
// Output: 2 2 2 1 1 3 3 4 
// Explanation: Since  2 is present 3 times in an array ,
// so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency,
// it will be printed at last.

public class ElembyFreq {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 2, 4, 3, 1, 2 };
        Sortelementsbyfreq(array, array.length);
    }

    static void Sortelementsbyfreq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Pair> vec = new ArrayList<>();
        for (int x : map.keySet()) {
            vec.add(new Pair(x, map.get(x)));
        }
        Collections.sort(vec, (a, b) -> {
            if (a.second == b.second)
                return a.first - b.first;
            else
                return b.second - a.second;
        });
        for (int i = 0; i < vec.size(); i++) {
            while (vec.get(i).second > 0) {
                System.out.print(vec.get(i).first + " ");
                vec.get(i).second--;
            }
        }
    }
}
class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    Pair() {
    }
}
