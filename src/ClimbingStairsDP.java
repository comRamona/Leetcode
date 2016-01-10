/**
 * Created by rama on 10/01/16.
 * Dynammic programming
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairsDP {
    public int climbStairs(int n) {
        int[] t = new int[n + 1];
        for (int i = 0; i <= n; i++)
            t[i] = -1;
        return climb(n, t);
    }

    public int climb(int n, int[] t) {
        if (t[n] != -1) return t[n];
        if (n == 0) t[n] = 0;
        else if (n == 1) t[n] = 1;
        else if (n == 2) t[n] = 2;
        else t[n] = climb(n - 1, t) + climb(n - 2, t);
        return t[n];
    }
}
