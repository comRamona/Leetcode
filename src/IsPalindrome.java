/**
 * Created by rama on 29/12/15.
 * Determine a plaindrome without using extra space
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int size = (int) Math.log10(x) + 1;
        int z = 1;
        int t = 1;
        for (int i = 1; i <= size / 2; i++) {
            int a = (x / z) % 10;
            int y = (int) Math.pow(10, size - t);
            int b = (x / y) % 10;
            if (a != b) return false;
            z = z * 10;
            t++;

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1227221));
    }
}