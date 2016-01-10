import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 08/01/16.
 * Given an index k, return the kth row of the Pascal's triangle.
 * <p>
 * For example, given k = 3,
 * Return [1,3,3,1].
 * <p>
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalKth {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> myList = generate(rowIndex);
        return myList;
    }

    public static List<Integer> generate(int rowIndex) {
        int j = 1;
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        List<Integer> other = new ArrayList<Integer>();

        while (j <= rowIndex) {
            other.add(1);
            System.out.println("enter");
            for (int i = 1; i < res.size(); i++) {
                other.add(res.get(i) + res.get(i - 1));
            }
            other.add(res.get(res.size() - 1));
            res = new ArrayList<Integer>(other);

            other = new ArrayList();
            j++;


        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(5));
    }
}
