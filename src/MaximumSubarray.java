/**
 * Created by rama on 16/01/16.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = nums[i];
        }
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) dp[i] = dp[i] + dp[i - 1];
            if (dp[i] > max) max = dp[i];
        }
        return max;
    }
}
