/**
 * Created by rama on 29/12/15.
 * <p>
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        String s = "1";
        String res = "";
        int nr = 1;
        while (nr != n) {
            char last = s.charAt(0);
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == last) count++;
                else {
                    res = res + count + last;
                    last = s.charAt(i);
                    count = 1;
                }
            }
            res = res + count + last;
            nr++;
            s = res;
            res = "";

        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(8));
    }
}
