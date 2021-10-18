import java.util.LinkedList;
import java.util.Queue;

class BSTNode {
    int key;
    BSTNode left;
    BSTNode right;

    BSTNode(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BinarySearchTree {
    BSTNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }



    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

         /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);


    }

}


//    void search(int key) {
//        boolean isFound = searchUtil(root, key);
//        System.out.println("isFound ? " + isFound);
//    }
//
//    boolean searchUtil(BSTNode root, int key) {
//        if(root == null) {
//            return false;
//        }
//        else if(key == root.key) {
//            return true;
//        }
//        else if(key < root.key) {
//          return searchUtil(root.left, key);
//        }
//        else if(key > root.key) {
//           return searchUtil(root.right, key);
//        }
//
//        return true; // Here, it won't execute
//    }

//    void levelOrderTraversal() {
//        if (root == null) return;
//
//        Queue<BSTNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            BSTNode current = queue.peek();
//            queue.remove();
//            System.out.println(current.key);
//
//            if (current.left != null) {
//                queue.add(current.left);
//            }
//            if (current.right != null) {
//                queue.add(current.right);
//            }
//        }
//    }

//    void inorder() {
//        inorderRec(root);
//    }
//
//    void inorderRec(BSTNode root) {
//        if (root == null)
//            return;
//
//        inorderRec(root.left);
//        System.out.println(root.key);
//        inorderRec(root.right);
//    }

//    int findMin() {
//        if (root == null)
//            return -1;
//
//        BSTNode current = root;
//
//        while (current.left != null) {
//            current = current.left;
//        }
//
//        return current.key;
//    }