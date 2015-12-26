import java.util.HashSet;
import java.util.Set;

/**
 * Created by rama on 26/12/15.
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number either equals 1 (where it will stay), or it loops endlessly
 * in a cycle which does not include 1
 * ex:19 is happy, 5 is not
 */
public class HappyNumbers {

    public static void main(String[] args) {
        System.out.println(new HappyNumbers().isHappy(19));
    }

    public boolean isHappy(int n) {
        Set<Integer> sum = new HashSet<Integer>();
        while (true) {
            int m = n, s = 0;
            while (m != 0) {
                int c = m % 10;
                s = s + c * c;
                m = m / 10;
            }
            n = s;
            if (s == 1) return true;
            if (sum.contains(s)) return false;
            sum.add(s);
        }
    }

}
