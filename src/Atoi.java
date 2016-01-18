/**
 * Created by rama on 05/01/16.
 */
public class Atoi {
    public static int myAtoi(String str) {
        int x = 0;
        str = str.trim();
        if (str == null || str.length() < 1)
            return 0;
        boolean min = false;
        int start = 0;
        if (str.charAt(0) == '-') {
            min = true;
            start++;
        }
        if (str.charAt(0) == '+') {
            start++;
        }
        while (start < str.length() && str.charAt(start) <= '9' && str.charAt(start) >= '0') {
            x = x * 10 + (str.charAt(start) - '0');
            if (x == Integer.MAX_VALUE)
                return Integer.MIN_VALUE;

            if (x == Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            start++;
        }
        if (min == true) x = -x;
        if (x == Integer.MAX_VALUE)
            return Integer.MIN_VALUE;

        if (x < Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        return x;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("9"));
    }
}
