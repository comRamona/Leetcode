/**
 * Created by rama on 16/01/16.
 */
public class ReverseBits {
    public static int reverse(int n) {
        for (int i = 0; i < 16; i++) {
            int mask1 = 1 << i;
            int mask2 = 1 << (32 - i - 1);
            int get1 = (mask1 & n) == 0 ? 0 : 1;
            int get2 = (mask2 & n) == 0 ? 0 : 1;
            if (get1 == 1) n = n | mask2;
            else n = n & (~mask2);
            if (get2 == 1) n = n | mask1;
            else n = n & (~mask1);
        }
        return n;
    }
}
