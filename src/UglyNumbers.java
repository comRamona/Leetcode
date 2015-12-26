/**
 * Created by rama on 26/12/15.
 * UGly numbers are those whose only prime divisors are 2 or 3 or 5
 */
public class UglyNumbers {
    public static void main(String[] args) {
        System.out.println(new UglyNumbers().isUgly(7));
    }

    public boolean isUgly(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;
        int fact = 2;
        for (int i = 2; i <= num / i; i++) {
            while (num % i == 0) {
                fact = i;
                num = num / i;
            }
        }
        if (num > 1) fact = num;
        System.out.println(fact);
        return fact <= 5;
    }
}
