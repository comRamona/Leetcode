import java.util.HashMap;
import java.util.Map;

/**
 * Created by rama on 17/01/16.
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] defaultResult = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                int[] result = {map.get(target - nums[i]) + 1, i + 1};
                return result;
            }
            map.put(nums[i], i);
        }
        return defaultResult;
    }

    public int[] mytwoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i1 = 0, i2 = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer last = map.get(nums[i]);
            if (last != null) {
                if (target - nums[i] == nums[i]) {
                    res[0] = last;
                    res[1] = i + 1;
                    return res;
                }
            } else {
                map.put(nums[i], i + 1);
            }
        }
        for (Integer i : map.keySet()) {
            int val = map.get(i);
            Integer other = map.get(target - i);
            if (other != null) {
                i1 = val;
                i2 = other;
                res[0] = Math.min(i1, i2);
                res[1] = Math.max(i1, i2);
                return res;
            }
        }
        return res;
    }
}
