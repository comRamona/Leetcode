import java.util.LinkedList;
import java.util.List;

/**
 * Created by rama on 26/12/15.
 */
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
    }
}

public class DeepestNode {
    int max = 0;

    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(3);
        Node b = new Node(5);
        root.left = a;
        root.right = b;
        DeepestNode dn = new DeepestNode();
        List<Integer> list = dn.deepestNode(root);
        for (Integer l : list)
            System.out.print(l + " ");
    }

    //list with nodes
    public List<Integer> deepestNode(Node node) {
        Integer max = 0;
        List<Integer> list = new LinkedList<Integer>();
        deepest(node, list, 0);
        return list;
    }

    public void deepest(Node n, List list, int h) {
        if (n == null) return;
        if (max <= h) {
            if (max < h)
                list.clear();
            list.add(n.data);
            max = h;
        }
        deepest(n.left, list, h + 1);
        deepest(n.right, list, h + 1);

    }
}
