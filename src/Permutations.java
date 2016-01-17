import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 17/01/16.
 * Generate permutations  by building from permutations from previous case and inserting next element at every position
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        return helper(nums, 0);

    }

    public static List<List<Integer>> helper(int[] nums, int index) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length == index) {
            result.add(new ArrayList<Integer>());  //base case
            return result;
        }

        List<List<Integer>> prev = helper(nums, index + 1);
        for (List<Integer> list : prev) {
            for (int i = 0; i <= list.size(); i++) {
                List<Integer> next = new ArrayList(list);
                next.add(i, nums[index]);
                result.add(next);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(
                permute(new int[]{1, 5, 6})
        );
    }
}
