
class Node {
	int data;
	Node left;
	Node right;

	Node(int n) {
		data = n;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;
	static int maxLevel = 0;
	
	
	void leftViewUtil(Node node, int level)
	{
	    if(node == null)
	    	return;
	    
	    if(maxLevel < level)
	    {
	    	System.out.print(node.data + " ");
	    	maxLevel = level;
	    }
	    
	    leftViewUtil(node.left, level+1);
	    leftViewUtil(node.right, level+1);
	}

	void leftView()
	{
		leftViewUtil(root, 1);
	}
	
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);
		tree.root.right.right.right = new Node(60);
		tree.leftView();

	}

}
