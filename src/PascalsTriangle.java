import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 08/01/16.
 * Generate n rows of Pascal's Triangle
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ns = new ArrayList();
        if (numRows == 0) return ns;
        generate(ns, numRows, 1);
        return ns;
    }

    public void generate(List<List<Integer>> lists, int numRows, int index) {
        if (index == 1) {
            List<Integer> l = new ArrayList<Integer>();
            l.add(1);
            lists.add(l);
            generate(lists, numRows, index + 1);
        }
        if (index > numRows) return;
        if (index > 1) {
            List<Integer> prev = lists.get(index - 2);
            List<Integer> nl = new ArrayList<Integer>();
            nl.add(prev.get(0));
            for (int i = 1; i < prev.size(); i++) {
                int x = prev.get(i - 1);
                int y = prev.get(i);
                int z = x + y;
                nl.add(z);
            }
            nl.add(prev.get(prev.size() - 1));
            lists.add(nl);
            generate(lists, numRows, index + 1);
        }
    }
}
