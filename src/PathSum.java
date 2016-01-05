/**
 * Created by rama on 05/01/16.
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals the given sum.
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return helper(root, sum, 0);

    }

    public boolean helper(TreeNode root, int sum, int curr) {
        if (root == null) return false;
        curr += root.val;
        if (sum == curr) {
            return root.left == null && root.right == null;
        }

        return helper(root.left, sum, curr) || helper(root.right, sum, curr);
    }
}
