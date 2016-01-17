/**
 * Created by rama on 17/01/16.
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
    public void myrotate(int[] nums, int k) {
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = b[i];
    }

    /**
     * Can we do this in O(1) space and in O(n) time? The following solution does.
     * <p>
     * Assuming we are given {1,2,3,4,5,6} and order 2. The basic idea is:
     * <p>
     * 1. Divide the array two parts: 1,2,3,4 and 5, 6
     * 2. Rotate first part: 4,3,2,1,5,6
     * 3. Rotate second part: 4,3,2,1,6,5
     * 4. Rotate the whole array: 5,6,1,2,3,4
     */

    public void rotate(int[] arr, int order) {
        order = order % arr.length;

        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
