// Question 2

class RLinkedList{
    static Node head;
	
	static class Node{
	    int data;
		Node next;
		//Node prev;
		
		Node(int d){
		    this.data = d;
			next = null;
			//prev = null;
		
		}
	}
	
	void display(Node n){
		while( n != null )
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		
	}
	
	Node reverse(Node n){
		Node prev = null;
		Node temp = null;
		Node next = null;
		//Node temp = null;
		
		while (temp != null)
		{
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		n = prev;
		return n;
	}
	
	/*int duplicate(Node n){
		Node n = head ;
		
		while (n!=null)
		{
			n.data++;
			n = n.next;
			
		}
		n = head;
        
        while ()		
		
	}*/
	
	
	public static void main (String[] args){
		
		RLinkedList r = new RLinkedList();
		
		r.head = new Node (5);
		r.head.next = new Node(4);
		r.head.next.next = new Node(3);
		r.head.next.next.next = new Node(2);
		r.head.next.next.next.next = new Node(1);
		//r.head.next.next.next.next.next = new Node(5);
		//r.head.next.next.next.next.next.next = new Node(1);
		
		//System.out.println("");
		r.display(head);
		
		head = r.reverse(head);
		r.display(head);
		
	}
	
	
	
}