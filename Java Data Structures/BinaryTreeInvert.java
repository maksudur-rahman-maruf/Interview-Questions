import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeInvert {

    TreeNode root;

    void invert() {
        root = invert(root);
    }

     /* Let us create following Binary Tree
              50                     50
           /     \                /      \
          30      70             70      30
         /  \    /  \           /  \    /  \
       20   40  60   80        80  60  40  20        */

    TreeNode invert(TreeNode node) {
        if (node == null)
            return node;

        TreeNode left = invert(node.left);
        TreeNode right = invert(node.right);

        node.left = right;
        node.right = left;

        return node;
    }


    void levelOrderTraversal() {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.peek();
            queue.remove();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }


    public static void main(String[] args) {

        BinaryTreeInvert binaryTree = new BinaryTreeInvert();
        binaryTree.root = new TreeNode(50);
        binaryTree.root.left = new TreeNode(30);
        binaryTree.root.right = new TreeNode(70);
        binaryTree.root.left.left = new TreeNode(20);
        binaryTree.root.left.right = new TreeNode(40);
        binaryTree.root.right.left = new TreeNode(60);
        binaryTree.root.right.right = new TreeNode(80);

        System.out.println("Traversal Before Inverted");
        binaryTree.levelOrderTraversal();

        binaryTree.invert();
        System.out.println();
        System.out.println("Traversal after Inverted");
        binaryTree.levelOrderTraversal();

    }
}
