import java.util.HashMap;
import java.util.Map;

/**
 * Created by rama on 29/12/15.
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the difference between i and j is at most k.
 */
public class DuplicateNearby {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        for (int nr = 0; nr < n; nr++) {
            int a = nums[nr];
            if (map.containsKey(a)) {
                if (nr - map.get(a) <= k) return true;
            }
            map.put(a, nr);
        }
        return false;
    }
}