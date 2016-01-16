/**
 * Created by rama on 15/01/16.
 */
public class DecToBinary {
    public static String toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int digit = (mask & n) == 0 ? 0 : 1;
            sb.append(digit);
        }
        return sb.reverse().toString();
    }

    public static String toBinary2(int n) {
        int p10 = 1;
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

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

    public static void main(String[] args) {

        int i = 8;
        System.out.println(toBinary(i));
        System.out.println(toBinary2(i));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(reverse(i)));
    }
}
