package codingBat;
public class MergeLinkedList {
	
	Node head=null;

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
				System.out.println();
			}
		
		
		//Function to merge the two sorted linked lists
		public static Node merge(Node head1, Node head2){
			
			Node resultList = null;
			
			if(head1==null){
				return head2;
			}
			
			else if(head2==null){
				return head1;
			}
			
			if(head1.val>head2.val){
				resultList = head2;
				resultList.next = merge(head1,head2.next);
			}
			else{
				resultList = head1;
				resultList.next = merge(head1.next,head2);
				
			}
			
			return resultList;
			
			
		}
		
	
	

		
	
	public static void main(String[] args) {
		
		MergeLinkedList l1 = new MergeLinkedList();
		MergeLinkedList l2 = new MergeLinkedList();
		MergeLinkedList l3 = new MergeLinkedList();
		//MergeLinkedList f = new MergeLinkedList();
		l1.add(3);
		l1.add(9);
		l1.add(20);
		l1.add(15);
		l1.add(6);
		l1.add(33);
		System.out.println("The first linked list is");
		l1.display(l1.head);
		
		//Adding elements to L2 list
		//System.out.println("\n");
		l2.add(9);
//		l2.add(5);
//		l2.add(4);
//		l2.add(2);
		System.out.println("The second linked list is");
		l2.display(l2.head);
		System.out.println("\n");
		
		//l1.partition(l1.head, 9);
		l1.display(l1.head);
		
//		System.out.println(l1.head.val);
//		System.out.println(l2.head.val);
		
		
		
		
		System.out.println("The merged linked list is");
		
		
		Node res = l3.merge(l1.head, l2.head);
	    l3.display(res);
	    
	    //Time Complexity is O(m+n).

	}

}
