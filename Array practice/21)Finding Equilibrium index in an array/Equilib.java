// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4

public class Equilib {
    public static void main(String[] args) {
        int [] nums = {1,-1,4};
        int k = sum(nums);
        System.out.println(k);
    }
    static int sum(int[] nums) {
        int total=0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int lsum = 0, rsum = total;
        for(int i = 0; i < nums.length; i++) {
            rsum -= nums[i];
            if(lsum == rsum) return i;
            lsum += nums[i];
        }
        return -1;

    }
}
