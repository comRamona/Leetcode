import java.util.Scanner;

/**
 * Created by rama on 05/01/16.
 * Suppose you have a string S that has the length N. It is indexed from 0 to N−1. String R is the reverse of string S. The string S is funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.
 */
public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int test = 1; test <= tests; test++) {
            String s = sc.next();
            String rev = new StringBuilder(s).reverse().toString();
            boolean w = true;
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != Math.abs(rev.charAt(i) - rev.charAt(i - 1))) {
                    w = false;
                    break;
                }
            }
            if (w == true) System.out.println("Funny");
            else System.out.println("Not Funny");

        }
    }

}
