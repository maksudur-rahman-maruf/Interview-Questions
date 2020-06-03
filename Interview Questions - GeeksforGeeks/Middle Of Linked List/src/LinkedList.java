
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
	
	void printMiddle()
	{
	    Node slow_ptr = head;
	    Node fast_ptr = head;
	    
	    if(head!=null)
	    {
	    	while(fast_ptr != null && fast_ptr.next != null)
	    	{
	    		fast_ptr = fast_ptr.next.next;
	    		slow_ptr = slow_ptr.next;
	    	}
	    	
	    	System.out.println("Middle Element is: "+ slow_ptr.data);
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
		//llist.push(60);
		
		llist.printList();
		
		llist.printMiddle();
		

	}

}
