import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rama on 26/12/15.
 */
public class LevelDepths {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        getLevels(lists, root, 0);
        return lists;
    }

    public void getLevels(List<List<Integer>> lists, TreeNode root, int lvl) {
        if (root == null) return;
        List<Integer> list = null;
        if (lists.size() == lvl) {
            list = new LinkedList<Integer>();
            list.add(root.val);
            lists.add(list);
        } else {
            list = lists.get(lvl);
            list.add(root.val);
        }
        getLevels(lists, root.left, lvl + 1);
        getLevels(lists, root.right, lvl + 1);
    }
}
