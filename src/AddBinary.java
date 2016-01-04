/**
 * Created by rama on 04/01/16.
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int x = 0, y = 0;
            if (i >= 0) x = Integer.parseInt(a.charAt(i) + "");
            if (j >= 0) y = Integer.parseInt(b.charAt(j) + "");
            i--;
            j--;
            int s = x + y + carry;
            if (s == 3) {
                s = 1;
                carry = 1;
            } else if (s == 2) {
                s = 0;
                carry = 1;
            } else if (s == 1) carry = 0;
            else carry = 0;
            sb.append(Integer.toString(s));
        }
        if (carry != 0) sb.append(Integer.toString(carry));
        sb.reverse();
        return sb.toString();
    }
}
