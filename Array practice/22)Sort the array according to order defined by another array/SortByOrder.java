// Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//            A2[] = {2, 1, 8, 3}
// Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}

import java.util.HashMap;

class SortByOrder {
	static void sortA1ByA2(int A1[], int N, int A2[], int M,
			int ans[]) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		int ind = 0;
		for (int i = 0; i < N; i++) {
			if (!mp.containsKey(A1[i]))
				mp.put(A1[i], 1);
			else
				mp.put(A1[i], mp.get(A1[i]) + 1);
		}

		for (int i = 0; i < M; i++) {

			if (mp.containsKey(A2[i])) {

				for (int j = 1; j <= mp.get(A2[i]); j++)
					ans[ind++] = A2[i];
			}

			mp.remove(A2[i]);
		}

		for (HashMap.Entry<Integer, Integer> it : mp.entrySet()) {

			for (int j = 1; j <= it.getValue(); j++)
				ans[ind++] = it.getKey();
		}
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
		
	}

	public static void main(String[] args) {
		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int A2[] = { 2, 1, 8, 3 };
		int n = A1.length;
		int m = A2.length;
		int ans[] = new int[n];
		sortA1ByA2(A1, n, A2, m, ans);		
	}
}
