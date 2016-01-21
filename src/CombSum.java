import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rama on 17/01/16.
 */
public class CombSum {
    public static List calc(int[] coins, int s) {
        int nr = coins.length - 1;
        int[] min = new int[s + 1];
        List<Integer>[] lists = new List[s + 1];
        lists[0] = new LinkedList<Integer>();
        for (int i = 1; i <= s; i++) {
            min[i] = Integer.MAX_VALUE;
            lists[i] = new LinkedList<Integer>();
        }
        min[0] = 0;
        for (int sum = 1; sum <= s; sum++)
            for (int val = 0; val <= nr; val++) {
                if (coins[val] <= sum)
                    if (min[sum - coins[val]] != Integer.MAX_VALUE) {
                        min[sum] = 0;
                        // lists[sum].clear();
                        List<Integer> nl = new ArrayList<>();
                        nl.addAll(lists[sum - coins[val]]);
                        nl.add(coins[val]);
                        lists[sum].addAll(nl);
                    }
            }
        return lists[s];
    }

    public static void main(String[] args) {
        int[] coins = {2, 2, 3, 7};
        int sum = 7;
        System.out.println(calc(coins, sum));
    }
}
