import java.util.Scanner;

public class StringSimilarity {

    public static int sim(String s1, String s2) {
        int j = 0;
        int l = s2.length();
        while (j < l && s1.charAt(j) == s2.charAt(j)) {
            j++;

        }
        return j;

    }

    public static int calc(String s) {
        int sum = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            String ss = s.substring(i);
            sum += sim(s, ss);
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner s = new Scanner(System.in);
        int nr = s.nextInt();
        int i = 1;
        while (i <= nr) {
            i++;
            String str = s.next();
            System.out.println(calc(str));
        }
    }
}

