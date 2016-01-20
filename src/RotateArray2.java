import java.util.Arrays;

/**
 * Created by rama on 19/01/16.
 */
public class RotateArray2 {
    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[(i + k) % n] = a[i];
        }
        for (int i = 0; i < n; i++)
            a[i] = t[i];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        rotate(a, 2);
        System.out.println(Arrays.toString(a));
    }
}
