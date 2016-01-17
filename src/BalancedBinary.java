/**
 * Created by rama on 17/01/16.
 */
public class BalancedBinary {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    public int checkHeight(TreeNode root) {
        if (root == null)
            return -1;
        int left = checkHeight(root.left);
        if (left == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        int right = checkHeight(root.right);
        if (right == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        int diff = left - right;
        if (Math.abs(diff) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(left, right) + 1;
    }

    public boolean isBalancedEasy(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) return false;
        else return isBalancedEasy(root.left) && isBalancedEasy(root.right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
