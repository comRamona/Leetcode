import java.util.Scanner;

/**
 * Created by rama on 05/01/16.
 */
public class KnapSack {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();  //no of test cases
        for (int test = 1; test <= tests; test++) {
            int n = sc.nextInt();
            int cap = sc.nextInt();   //capacity of knapsack
            int[] whs = new int[n];   //weights of objects
            for (int i = 0; i < n; i++)
                whs[i] = sc.nextInt();
            int[] possible = new int[cap + 1];
            possible[0] = 0;
            for (int i = 1; i <= cap; i++)
                possible[i] = -1;

            for (int i = 1; i <= cap; i++)
                for (int j = 0; j < n; j++)
                    if (whs[j] <= i)
                        if (possible[i - whs[j]] != -1)
                            possible[i] = 0;
            for (int i = cap; i >= 0; i--)
                if (possible[i] != -1) {
                    System.out.println(i);
                    break;
                }
        }
    }
}
