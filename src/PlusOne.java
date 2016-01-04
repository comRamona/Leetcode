import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 04/01/16.
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    // {2,3,4,1}
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer> res = new ArrayList<Integer>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = sum;
                return digits;
            }
        }
        int[] d2 = new int[digits.length + 1];
        d2[0] = 1;
        for (int i = 0; i <= digits.length - 1; i++)
            d2[i + 1] = digits[i];
        return d2;
    }
}
