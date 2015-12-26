/**
 * Created by rama on 26/12/15.
 */
public class PrimeFactorization {
    public static void printFactors(int product) {
        for (int factor = 2; factor * factor <= product; factor++) {
            int exponent = 0;
            while (product % factor == 0) {
                product /= factor;
                exponent++;
            }
            if (exponent > 0) {
                System.out.println(factor + "^" + exponent);
            }
        }
        if (product > 1) System.out.println(product + "^1");
    }

    public static void main(String[] args) {
        PrimeFactorization pf = new PrimeFactorization();
        printFactors(135);
    }
}
