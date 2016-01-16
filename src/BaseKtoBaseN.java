/**
 * Created by rama on 16/01/16.
 */
public class BaseKtoBaseN {
    public static long kToN(long nr, int k, int n) {
        long res = 0;
        long pk = 1;
        while (nr != 0) {
            res += (nr % n) * pk;
            pk *= k;
            nr /= n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(kToN(10000101, 2, 10));
    }
}
