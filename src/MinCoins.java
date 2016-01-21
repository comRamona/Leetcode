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

    /**
     *  Knapsack unbounded
     *  for (int g=1;g<=b; g++)
     {
     for (int y=0;y<c.size(); y++)
     {
     if (c[y]>g) continue;
     dp[g]=max(dp[g], c[y]+dp[g-c[y]]);
     }
     }
     cout << dp[b] << '\n';} return 0;
     */

    /**
     * Knapsack bounded 0,1
     * for j from 0 to W do:
     * m[0, j] := 0
     * <p>
     * for i from 1 to n do:
     * for j from 0 to W do:
     * if w[i-1] <= j then:
     * m[i, j] := max(m[i-1, j], m[i-1, j-w[i-1]] + v[i-1])
     * else:
     * m[i, j] := m[i-1, j]
     */
    public static void main(String[] args) {
        int[] coins = {2, 2, 3, 7};
        int sum = 7;
        System.out.println(calc(coins, sum));
    }
}
