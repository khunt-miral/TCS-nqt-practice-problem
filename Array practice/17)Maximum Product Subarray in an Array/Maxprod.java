// Input:
//  Nums = [1,2,3,4,5,0]
// Output:
//  120
// Explanation:
//  In the given array, we can see 1×2×3×4×5 gives maximum product value.

// We will use here kadane's algorithm
public class Maxprod {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 0, -4, -5 };
        int ans = arr[0], maxprod = ans, minProd = ans;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // swap(maxprod, minProd);
                int tmp = maxprod;
                maxprod = minProd;
                minProd = tmp;
            }
            maxprod = Math.max(arr[i], maxprod * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);
            ans = Math.max(maxprod, ans);
        }
        System.out.println(ans);
    }
}
