import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rama on 05/01/16.
 */
public class PreorderIterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new LinkedList<Integer>();
        preorderI(li, root);
        return li;
    }

    public void preorderI(List<Integer> li, TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (stack.empty() == false) {
            int v = stack.peek().val;
            li.add(v);
            TreeNode node = stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);


        }
    }


    public void preorderR(List<Integer> li, TreeNode root) {
        if (root == null) return;
        li.add(root.val);
        preorderR(li, root.left);
        preorderR(li, root.right);
    }
}
