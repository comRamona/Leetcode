import java.util.Scanner;

/**
 * Created by rama on 05/01/16.
 * (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 */
public class Pangram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c <= 'z' && c >= 'a') {
                int index = c - 'a';
                a[index]++;
            }
            if (c <= 'Z' && c >= 'A') {
                int index = c - 'A';
                a[index]++;
            }
        }
        boolean w = true;
        for (int i = 0; i < 26; i++)
            if (a[i] == 0) {
                w = false;
                break;
            }
        if (w == true) System.out.print("pangram");
        else
            System.out.print("not pangram");
    }
}
