package codingBat;
//Find the pair equal to the sum that is passed to a Doubly Linked List.
public class PairSum {
	Node head;
	//Defining class
public class Node {
	
	// Node class creation
	private int val;
    private Node next;
    private Node prev;
	public Node(int val,Node prev, Node next){
	
	this.val = val;
	this.next = null;
	this.prev = null;
	}
}


// To check if the DLL is already empty
public boolean isEmpty() {
	if (head == null) {
		return true;
	}
	return false;

}


/*
 * Method to display the elements in the double linked list.
 */
public void display() {
	Node temp = head;
	while (temp != null) {
		System.out.print(temp.val + " ");
		temp = temp.next;
	}
	System.out.println();
}

  //Adding elements at the end
	public void add(int val){
			
	//instance of Node class
	Node n = new Node(val,null,null); // to point the next and prev reference of the newly created node to head
    
	if (isEmpty()){
		head = n;
		
	}
	else{
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		n.prev = temp;
		temp.next = n;
	
	}
	//return head;
	}


	
	public static void FindPairSum(Node head, int x){
		Node first = head;
		Node second = head;
		
		while(second.next!=null)
			second = second.next;
		
		
		boolean found = false;
		
		while(first!=null && second!=null && first!= second && second.next!=first)
		{
			//pair found case
			if(first.val+second.val == x){
				found = true;
				System.out.printf("(" + first.val +","+second.val+")");
			
			
			first = first.next;
			second = second.prev;
			}
			else {
				
			if (first.val+second.val<x)
				first = first.next;
				else
			second = second.prev;
			}
		}
				
				
			//If no pair
			if(found == false){
				System.out.println("No pair found equal to the sum given");
			}
		}
		
	
	
	public static void main(String[] args) {
		
		PairSum mp = new PairSum();

		mp.add(0);
		mp.add(10);
		mp.add(15);
		mp.add(20);
		mp.add(25);
		mp.add(35);
		
		System.out.println("My Doubly Linked List...\n");
		mp.display();
		
		int x = 25;
		FindPairSum(mp.head,x);
	

	}

	

}




