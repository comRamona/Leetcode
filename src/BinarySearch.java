/**
 * Created by rama on 21/01/16.
 */
public class BinarySearch {
    public static int search(int[] a, int e) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (a[m] == e) return m;
            else if (e < a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6, 12, 15};
        System.out.println(search(a, 6));
    }
}
