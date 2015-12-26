/**
 * Created by rama on 26/12/15.
 */
public class FirstCommonAncestor {
    public static void main(String[] args) {
        FirstCommonAncestor fc = new FirstCommonAncestor();
        Node root = new Node(5);
        Node eight = new Node(8);
        Node three = new Node(3);
        root.right = eight;
        root.left = three;
        Node two = new Node(2);
        Node five = new Node(5);
        three.left = two;
        Node zero = new Node(0);
        Node one = new Node(1);
        three.right = five;
        two.left = zero;
        two.right = one;
        Node four = new Node(4);
        five.left = four;
        Node x = fc.fca(root, two, four);
        System.out.println(x.data);
    }

    /**
     * 6
     * /  \
     * 3   8
     * / \
     * 2    5
     * / \   /
     * 0  1   4
     */

    // < left, > right, < >
    public Node fca(Node root, Node a, Node b) {
        if (root == null) return null;
        if (a.data <= root.data && b.data <= root.data)
            return fca(root.left, a, b);
        else if (a.data > root.data && b.data >= root.data)
            return fca(root.right, a, b);
        else
            return root;

    }
}
