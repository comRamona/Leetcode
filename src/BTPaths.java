import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 17/01/16.
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * For example, given the following binary tree:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * All root-to-leaf paths are:
 * <p>
 * ["1->2->5", "1->3"]
 */
public class BTPaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if (root == null) return list;
        helper(root, list, new String());
        return list;
    }

    public void helper(TreeNode root, List<String> list, String str) {
        if (root == null) return;
        else if (root.left == null && root.right == null) {
            String s = str + root.val;
            list.add(s);
        } else {
            String s = str + root.val + "->";
            //recurse left and right
            helper(root.left, list, s);
            helper(root.right, list, s);
        }
    }
}
