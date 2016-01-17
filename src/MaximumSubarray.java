/**
 * Created by rama on 16/01/16.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 *
 * DP//
 * Kadane's algorithm
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] intArr = {-3, -1, -5, -2, 4};
        //int[] intArr = {-1, 3, -5, 4, 6, -1, 2, -7, 13, -3};
        //int[] intArr={-6,-2,-3,-4,-1,-5,-5};
        int x = maxSequenceSum(intArr);
        System.out.println(x);
    }

    public static void findMaxSubArray(int[] inputArray) {

        int maxStartIndex = 0;
        int maxEndIndex = 0;
        int maxSum = Integer.MIN_VALUE;

        int cumulativeSum = 0;
        int maxStartIndexUntilNow = 0;

        for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {

            int eachArrayItem = inputArray[currentIndex];

            cumulativeSum += eachArrayItem;

            if (cumulativeSum > maxSum) {
                maxSum = cumulativeSum;
                maxStartIndex = maxStartIndexUntilNow;
                maxEndIndex = currentIndex;
            } else if (cumulativeSum < 0) {
                maxStartIndexUntilNow = currentIndex + 1;
                cumulativeSum = 0;
            }
        }

        System.out.println("Max sum         : " + maxSum);
        System.out.println("Max start index : " + maxStartIndex);
        System.out.println("Max end index   : " + maxEndIndex);
    }

    public static int maxSequenceSum(int[] arr) {
        //Kadane's Algorithm
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            /* calculate maxEndingHere */
            if (maxEndingHere < 0)
                maxEndingHere = arr[i];
            else
                maxEndingHere += arr[i];

            /* calculate maxSoFar */
            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }

    public int maxSubArray(int[] nums) {
        //DP
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


