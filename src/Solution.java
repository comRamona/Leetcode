import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        System.out.println(find(a, 0, n - 1));
    }


    public static int find(int[] nums, int i, int j) {
        if (j - i == 1) return Math.min(nums[i], nums[j]);
        if (i == j) return nums[i];
        int m = i + (j - i) / 2;
        if (nums[i] > nums[m]) return find(nums, i, m);
        else if (nums[m] > nums[j]) return find(nums, m, j);
        else return nums[i];
    }

}