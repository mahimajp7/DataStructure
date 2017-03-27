package codingBat;

public class RemoveDuplicateLinkedList {
	static Node head=null;

	//Adding elements at the front of head
public void add(int val){
	
	//instance of Node class
	Node n = new Node(val); // to point the next reference of the newly created node to head
	n.next = head;
	head = n;
}


//Display function
		public void display(Node head){
			
			Node temp = head;
			while(temp!= null) //This will traverse until last but one node
			{
					//System.out.println("\n");
					System.out.print(temp.val+" ");
					//System.out.print("-->");
					temp = temp.next;
				}
		}
		
		public void RemoveDuplicate(Node head ){
			Node temp = head;
			if(head==null){
				return;
			}
			
			Node next = null;
			
			while(temp!=null && temp.next!=null){
				
				next = temp.next;
				while(next!=null && next.val==temp.val){
					temp.next = next.next;
					next = next.next;
				}
				
				temp = temp.next;
			}
		}
			
		
		//Function to partition the linked list given a node value such that, elements lesser than that value are on the left 
				//of that node and elements greater than that are on the right of that value
		//In this approach we start a new list using the existing nodes.		
				public void partition(Node n, int x){
					
					Node less = null;
					Node more = null;
					Node moreI = null;
					//Node next = null;
					
					while(n!=null){
						
						if(n.val < x ){
							if (less == null) {
				                less = n;
				            } else {
				                less.next = n;
				                less = less.next;
				            }
				        } else {
				            if (more == null) {
				                more = n;
				                moreI = n;
				            } else {
				                more.next = n;
				                more = more.next;
				            }
				        }
				        n = n.next;
				    }
				 
				    if (less == null) {
				        n = moreI;
				    } else {
				        less.next = moreI;
				        n = less;
				    }
				}
	
	
	public static void main(String[] args) {
		RemoveDuplicateLinkedList l1 = new RemoveDuplicateLinkedList();
//		MergeLinkedList l2 = new MergeLinkedList();
//		MergeLinkedList l3 = new MergeLinkedList();
		//MergeLinkedList f = new MergeLinkedList();
	    
		l1.add(25);
		l1.add(20);
		l1.add(15);
		l1.add(6);
		l1.add(6);
		l1.add(3);
		l1.add(9);
		System.out.println("The given linked list is");
		l1.display(head);
		
		//Removing the duplicate
		l1.RemoveDuplicate(head);
		System.out.println("\n");
		System.out.println("After removing duplicates...");
		l1.display(head);
		
		//After partitioning	
		l1.partition(head, 9);
		System.out.println("\n");
		l1.display(head);
		
		

	}

}
