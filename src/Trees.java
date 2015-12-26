import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public class Solution {


        void LevelOrder(Node root)  //using BFS
        {
            LinkedList<Node> queue = new LinkedList<Node>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node n = queue.getFirst();
                queue.removeFirst();
                System.out.print(n.data + " ");
                if (n.left != null) queue.add(n.left);
                if (n.right != null) queue.add(n.right);
            }

        }

        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if ((root.left == null) || (root.right == null)) {
                return 1 + Math.max(minDepth(root.left), minDepth(root.right));
            }
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }

        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         * int val;
         * TreeNode left;
         * TreeNode right;
         * TreeNode(int x) { val = x; }
         * }
         */

        //flatten a tree to a tree that looks like a list
        public void flatten(TreeNode root) {
            if (root != null) {
                if (root.left == null) flatten(root.right);
                else {
                    TreeNode max = max(root.left);
                    TreeNode Oldright = root.right;
                    max.right = Oldright;
                    root.right = root.left;
                    root.left = null;
                    flatten(root.right);
                }
            }
        }

     /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

        public TreeNode max(TreeNode root) {
            if (root.right == null) return root;
            else return max(root.right);
        }

        class Node {
            int data;
            Node left;
            Node right;
        }


    }
}