import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 17/01/16.
 * Generate combinations based on previous solution
 */
public class Combinations {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    private int max;

    public List<List<Integer>> combine(int n, int k) {
        max = n;
        generator(1, k, new ArrayList<Integer>());
        return result;
    }

    private void generator(int bigest, int count, List<Integer> list) {
        if (count == 0)
            result.add(list);
        else {
            for (int i = bigest; i <= max - count + 1; i++) {
                List<Integer> temp = new ArrayList<Integer>(list);
                temp.add(i);
                generator(i + 1, count - 1, temp);
            }
        }
    }
}
