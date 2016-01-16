/**
 * Created by rama on 16/01/16.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
