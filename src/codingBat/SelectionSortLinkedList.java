package codingBat;

class Node {
	// Node class creation
			public int val;
			public Node next;
			Node(int val){
				this.val = val;
				this.next = null;
			}
			
}


public class SelectionSortLinkedList {
	
	public static Node head=null;
	Node tail;
	
	//Adding elements
public void add(int val){
	//instance of Node class
	Node n = new Node(val); // to point the next reference of the newly created node to head
	if(head==null){
		head = n;
	}
	else{
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
			
		}
		temp.next = n;
	}
}

//Display function
		public void display(Node temp){
			if(temp==null){
				System.out.println("Empty list");
			}
			else{
				//System.out.println("Before Sorting: ");
				while(temp!= null) //This will traverse until last but one node
				{
					System.out.print(temp.val+ " ");
					//System.out.print("-->");
					temp = temp.next;
				}
				//System.out.println(temp.val);
			}
			//System.out.println("\nAfter Sorting: ");
		}
		
		
		//Sorting function
		
		 Node SSort(Node head){
			 Node done = null;
			 Node min;
			 Node prev;
			 Node prevItem;
			 
			 
			 
			 for(Node start=head; start!=null;start = done.next ){
				 min = prev = prevItem = null;
				 for(Node item = start ; item!=null; item=item.next){
					 
					 if(min == null|| item.val < min.val){
						 
						 min = item;
						 prev = prevItem;
						 
					 }
					 prevItem = item;
				 }
					 
					 if(min!= start){
						 
						 prev.next = min.next;
						 min.next = start;
						 if(done!=null) done.next = min;
						 else head = min;
					 				 
					 
				 }
				
				 done = min; 
			 }
			return head;
		 }
		
		
	public static void main(String[] args) {
		
		SelectionSortLinkedList sll = new SelectionSortLinkedList();
		
		sll.add(20);
		sll.add(3);
		sll.add(16);
		sll.add(22);
		sll.add(45);
		sll.add(28);
		sll.add(34);
		sll.add(11);
		sll.add(80);
		sll.add(65);
		
		System.out.println("\nBefore Sorting :");
		sll.display(head);
		head = sll.SSort(head);
		System.out.println("\nAfter Sorting :");
		sll.display(head);
		
		
	}

}
