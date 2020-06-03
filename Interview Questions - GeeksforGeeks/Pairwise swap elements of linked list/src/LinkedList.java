
class Node {
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

public class LinkedList {
	Node head;
	
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void pairWiseSwap()
	{
		Node temp = head;
		
		while(temp != null && temp.next != null)
		{
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			
			temp = temp.next.next;
		}
		
	}
	
	void printList()
	{
		Node tnode = head;
		while(tnode != null)
		{
			System.out.println(tnode.data);
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(40);
		llist.push(50);
		llist.push(60);
		
		llist.printList();
		
		llist.pairWiseSwap();
		
		System.out.println("After Swapping: ");
		llist.printList();
		

	}

}
