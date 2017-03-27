package codingBat;

public class LinkedListReverse {
	
	public static Node head=null;
	
		//Adding elements at the end
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
	//Adding element at the start
	
	public void addfront(int val){
		
		Node n1 = new Node(val);
		if(head==null){
			head = n1;
			n1.next = null;
		}
		else{
			//Node temp = head;
			n1.next = head;
			head = n1;
		}
	}
		
	
	//Function to delete a node
	
	void deleteNode(int position){
		//checking if the list is empty
		
		if(head==null){
			return;
		}
		
		//if the position is at 0, that is to delete the first node
		Node temp = head;
		
		if(position==0){
			
			head = temp.next;
			return;
			
		}
		//find the previous of the node to be deleted
		
		for(int i =0; temp!=null && i<position - 1 ; i++){
			temp = temp.next;
			
		}
		if( temp==null || temp.next ==null){
			
			return;
		}
		
		Node next = temp.next.next;
		temp.next = next;
		
	}
	
	
	//Display function
		public void display(Node temp){
			if(temp==null){
				System.out.println("Empty list");
			}
			else{
				while(temp!= null) //This will traverse until last but one node
				{
					//System.out.println("\n");
					System.out.print(temp.val+" ");
					//System.out.print("-->");
					temp = temp.next;
				}
				//System.out.println(temp.val);
			}
		}
		
		//Function to reverse the linked list iteratively
		
			public  void LinkedListReverse(Node head){
				
				Node current = head;
				Node previous = null;
				Node next = null;
				
				if ((head == null)||(head.next  ==null)){
					
					return;
				}
				
				while(current!=null){
					next = current.next;
					current.next = previous;
					previous = current;
					current = next;
				}
				head = previous;
				Node temp = head;
				System.out.print("Reverse of Linked list by iterative approach : " );
				display(temp);
				}
				
			
			//Reversing using recursion
				
			public void RecursiveReverse(Node temp){
				
				if(temp.next == null){
					head = temp;
				}
				
				RecursiveReverse(temp.next);
				Node q = temp.next;
				q.next = temp;
				temp.next = null;
				
					
					
				
			}
	public static void main(String[] args) {
		
		
		LinkedListReverse lr = new LinkedListReverse();
		lr.add(10);
		lr.add(20);
		lr.add(30);
		lr.add(40);
		lr.display(head);
		lr.addfront(35);
		lr.addfront(55);
		
		System.out.println("\n");
		lr.display(head);
		lr.deleteNode(2);
		
		System.out.println("\n");
		lr.display(head);
		//lr.LinkedListReverse(head);
		
		//System.out.println("After reversing");  
		//lr.RecursiveReverse(head);
		//lr.display(head);
	
		//lr.display(reverseHead);  
		System.out.println("\n");
		lr.LinkedListReverse(head);

	}

}

