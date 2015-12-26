/**
 * Created by rama on 26/12/15.
 */

public class Insert {
    public Node Insert(Node root, int value) {
        if (root == null) {
            Node x = new Node(value);
            return x;
        } else {
            if (root.data <= value) root.right = Insert(root.right, value);
            else
                root.left = Insert(root.left, value);
            return root;

        }

    }
}