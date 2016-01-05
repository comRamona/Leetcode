import java.util.LinkedList;
import java.util.List;

/**
 * Created by rama on 05/01/16.
 * Lovely Dynammic Programming
 */
public class MinCoins {
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
                    if (min[sum - coins[val]] + 1 < min[sum]
                            && min[sum - coins[val]] != Integer.MAX_VALUE) {
                        min[sum] = min[sum - coins[val]] + 1;
                        lists[sum].clear();
                        lists[sum].addAll(lists[sum - coins[val]]);
                        lists[sum].add(coins[val]);
                    }
            }
        return lists[s];
    }

    public static void main(String[] args) {
        int[] coins = {3, 5, 6};
        int sum = 4;
        System.out.println(calc(coins, sum));
    }
}
