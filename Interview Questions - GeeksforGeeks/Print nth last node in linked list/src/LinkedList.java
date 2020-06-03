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
	Node head;
	
	void printNthFromLast(int n)
	{
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		
		if(length < n)
			return;
		
		//get the (length-n+1)th node from beginning 
		
		temp = head;
		for(int i = 1; i < length-n+1; i++)
		{
			temp = temp.next;
		}
		
		System.out.println("N th last node: " + temp.data);
	}
	
	void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp  = temp.next;
		}
		System.out.println();
	}
	
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		
		head = new_node;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);      // list would be 50 40 30 20 10
		list.push(40);
		list.push(50);
		
		list.printList();
		
		list.printNthFromLast(4);
		

	}

}
