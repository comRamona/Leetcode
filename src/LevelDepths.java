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
        if (root != null) {
            List<Integer> list;
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

    public void LevelOrder(TreeNode root)  //using BFS
    {
        List<List<TreeNode>> lists = new ArrayList();
        List<TreeNode> list = new ArrayList<>();
        if (root != null) list.add(root);
        while (list.size() > 0) {
            lists.add(list);
            List<TreeNode> parents = new ArrayList<>();
            list = new ArrayList<>();
            for (TreeNode parent : parents) {
                if (parent.left != null)
                    list.add(parent.left);
                if (parent.right != null)
                    list.add(parent.right);
            }
        }

    }
}
