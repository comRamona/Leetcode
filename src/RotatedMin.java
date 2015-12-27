/**
 * Created by rama on 27/12/15.
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.You may assume no duplicate exists in the array.
 */
public class RotatedMin {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1};
        System.out.println(new RotatedMin().findMin(a));
    }

    public int findMin(int[] nums) {
        return find(nums, 0, nums.length - 1);
    }

    public int find(int[] nums, int i, int j) {
        if (j - i == 1) return Math.min(nums[i], nums[j]);
        if (i == j) return nums[i];
        int m = i + (j - i) / 2;
        if (nums[i] > nums[m]) return find(nums, i, m);
        else if (nums[m] > nums[j]) return find(nums, m, j);
        else return nums[i];
    }

}