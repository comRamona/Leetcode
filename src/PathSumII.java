import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 20/01/16.
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p>
 * For example:
 * Given the below binary tree and sum = 22,
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * return
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList();
        calc(root, list, new ArrayList(), sum);
        return list;
    }

    public void calc(TreeNode root, List<List<Integer>> list, List<Integer> myl, int sum) {
        if (myl == null) myl = new ArrayList();
        if (root == null) return;
        myl.add(root.val);
        if (root.val == sum) {
            if (root.left == null && root.right == null) {
                list.add(myl);
            }

        }

        ArrayList<Integer> one = new ArrayList<Integer>(myl);
        ArrayList<Integer> two = new ArrayList<Integer>(myl);
        calc(root.left, list, one, sum - root.val);
        calc(root.right, list, two, sum - root.val);
    }
}
