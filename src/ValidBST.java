import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 04/01/16.
 */
public class ValidBST {
    public class Solution {
        public boolean isValidBST(TreeNode root) {
            List<Integer> l = new ArrayList<Integer>();
            inorder(l, root);
            for (int i = 1; i < l.size(); i++)
                if (l.get(i) <= l.get(i - 1)) return false;
            return true;
        }

        private void inorder(List l, TreeNode root) {
            if (root == null) return;
            inorder(l, root.left);
            l.add(root.val);
            inorder(l, root.right);
        }
    }
}
