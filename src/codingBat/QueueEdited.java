package codingBat;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class QueueEdited {
	
public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}

Node front; // Removal 
Node rear; // Adding
int size;
int t; //Number of elements


//Check if the queue is empty
	boolean isEmpty(){
		return front ==null;	
	}

	
	//Adding elements into the array list
	public void enqueue(int data){
		Node n = new Node(data);
		
		if(isEmpty())
			front = n;
		
		else
			rear.next = n;
			rear = n;
				
		t++;
		
	}
	
	//Dequeue operation
		
	public int dequeue()throws Exception{
		if(isEmpty()){
			throw new Exception("queue");
		}
		
		//if(front==null) throw new NoSuchElementException();
		int data = front.data;
		front = front.next;
		t--;
		if(isEmpty())
			rear=null;
		
		return data;
	}
	
	
	//returning the element at the front
	
		public int peek(){
			if(front==null) throw new NoSuchElementException();
			return front.data;
			
		}
		
		
		// Size of the queue
		public int size(){
			return t;
			
		}
		
		//Display elements of the linked list
		
		public String toString(){
			String result = "";
			Node current = front;
			while (current != null){
				result = result + current.data + " ";
				current = current.next;
			}
			return result;
		}
	
		
	
	public static void main(String[] args) throws Exception {
		
		QueueEdited queEd = new QueueEdited();
		
		for(int i=2 ; i< 5 ; i++){
			queEd.enqueue(i);
		}
		
		int q = queEd.size();
		System.out.println(q);
		
		queEd.toString();
		
		//queEd.dequeue();
		
		
		System.out.println(queEd.peek());
		
		queEd.dequeue();
		
		System.out.println(queEd.peek());
		
		System.out.print(queEd.toString());

	}

}
