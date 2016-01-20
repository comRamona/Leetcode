import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rama on 20/01/16.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */
public class LevelOrderReversed {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        get(list, root, 0);
        Collections.reverse(list);
        return list;
    }

    public void get(List<List<Integer>> list, TreeNode root, int lvl) {
        if (root == null) return;
        List<Integer> lvlList;
        if (lvl == list.size()) {
            lvlList = new ArrayList<Integer>();
            list.add(lvlList);
        }
        lvlList = list.get(lvl);
        lvlList.add(root.val);
        get(list, root.left, lvl + 1);
        get(list, root.right, lvl + 1);
    }
}
