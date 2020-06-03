class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}


public class LinkedList {
	static Node head;
	
	
	void deleteNode(Node node, Node n)
	{
		// when node to be deleted is the head node
		if(node == n)
		{
			if(node.next == null)
			{
				System.out.println("There is only one node! the list cant be made empty!");
				return;
			}
           
			node.data = node.next.data;
			
			n = node.next; // store address of next node
			
			node.next = node.next.next;
			
			System.gc();
			
			return;
		}
		
		//when not first node, follow the following procedures
		//find previous node
		Node prev = node;
		while(prev.next != null && prev.next != n)
		{
			prev = prev.next;
		}
		
		// check if node really exists in linked list
		if(prev.next == null)
		{
			System.out.println("Given node is not present in linked list");
			return;
		}
		
		prev.next = prev.next.next;
		
		System.gc();
		
		return;
	}
	
	void printList(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);
		list.head.next.next.next.next.next = new Node(60);
		
		list.printList(head);
		
		list.deleteNode(head, head.next.next);
		
		list.deleteNode(head, head);
		
		list.printList(head);
		

	}

}
