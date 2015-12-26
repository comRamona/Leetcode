/**
 * Created by rama on 27/12/15.
 * Pow implementation
 */
public class Pow {
    public double myPow(double x, int n) {
        double result = 1;
        int m = n;
        if (n < 0) n = -n;
        while (n > 0) {
            if (n % 2 != 0) {
                result = result * x;
            }
            x = x * x;
            n = n / 2;
        }

        if (m < 0) return 1 / result;
        return result;
    }
}