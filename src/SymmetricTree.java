/**
 * Created by rama on 05/01/16.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        } else if (r == null || l == null) {
            return false;
        }

        if (l.val != r.val)
            return false;

        if (!isSymmetric(l.left, r.right))
            return false;
        return isSymmetric(l.right, r.left);

    }
}
