import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rama on 05/01/16.
 * Generate all subsets of a set recursively
 */
public class PowerSet {
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allsubsets = getSubsets(nums, 0);
        return allsubsets;
    }

    public static List<List<Integer>> getSubsets(int[] set, int index) {
        List<List<Integer>> allsubsets;
        if (index == set.length) {    //base case
            allsubsets = new ArrayList();
            allsubsets.add(new ArrayList<Integer>()); //emptyset
        } else {
            allsubsets = getSubsets(set, index + 1);
            int item = set[index];
            List<List<Integer>> moresubsets = new ArrayList();
            for (List<Integer> subset : allsubsets) {
                List<Integer> newsubset = new ArrayList<Integer>();
                newsubset.addAll(subset);
                newsubset.add(item);
                moresubsets.add(newsubset);
            }
            allsubsets.addAll(moresubsets);
        }
        return allsubsets;
    }

    public static ArrayList<ArrayList<Integer>> getSubsets2(int[] set) {
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.length; //compute 2^n
        for (int k = 0; k < max; k++) {
            ArrayList<Integer> subset = convertIntToSet(k, set);
            allsubsets.add(subset);
        }
        return allsubsets;
    }

    public static ArrayList<Integer> convertIntToSet(int x, int[] set) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        int index = 0;
        for (int k = x; k > 0; k >>= 1) {
            if ((k & 1) == 1) {
                subset.add(set[index]);
            }
            index++;
        }
        return subset;
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{2, 1}));
        System.out.println(getSubsets2(new int[]{2, 5, 4}));
    }
}
