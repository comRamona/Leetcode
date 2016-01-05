/**
 * Created by rama on 05/01/16.
 * #no ways to make a sum
 */

import java.util.Scanner;

public class CoinsWays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++)
            val[i] = sc.nextInt();
        long[] ways = new long[sum + 1];
        ways[0] = 1;
        for (int i = 1; i <= sum; i++)
            ways[i] = 0;

        for (int i = 0; i < n; i++)
            for (int j = val[i]; j <= sum; j++)
                ways[j] += ways[j - val[i]];

        System.out.println(ways[sum]);
    }
}