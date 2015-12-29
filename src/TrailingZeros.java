/**
 * Created by rama on 29/12/15.
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note: Your solution should be in logarithmic time complexity.
 */
public class TrailingZeros {
    public static int trailingZeroes(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        int max = (int) (Math.log10(n) / Math.log10(5));
        System.out.println(max);
        for (int i = 1; i <= max; i++)
            sum += n / ((int) Math.pow(5, i));
        return sum;
    }

    public static void main(String[] args) {
        int i = trailingZeroes(50);
        System.out.println(i);
    }

    public int trailingZeroesEasy(int n) {
        //same thing but smarter :) count numbers that are multiples of every power
        int count = 0;
        while (n > 1) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}