import java.util.HashSet;
import java.util.Set;

/**
 * 271.
 * Created by rama on 29/12/15.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
