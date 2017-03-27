package codingBat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
	
	private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List
    boolean visited[];
    //Constructor
    bfs(int v)
    {
        V = v;
        adj = new LinkedList[v];
        visited  = new boolean[v];
        for (int i=0; i<v; ++i){
            adj[i] = new LinkedList();
            visited[i] = false;
        }
    }
	
	void addedge(int v, int u){
		adj[v].add(u);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> mq = new LinkedList<Integer>();
		
		bfs g = new bfs(4);
		
		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(1, 2);
		g.addedge(2, 0);
		g.addedge(2, 3);
		g.addedge(3, 3);
		
		g.bfSearch(2,g.visited, mq);
	}
	
	
 public void bfSearch(int start,boolean []visited, Queue mq) {
		
	 
	 
	visited[start]= true;
		 
	 if(!mq.contains((int)start))
		 mq.add(start);
	 
	 Iterator i = adj[start].iterator();
	 
	 while(i.hasNext()){
		 int nextElem=(int)i.next();
		 if(visited[nextElem]==false)
			 //mq.add(start);
			 mq.add(nextElem);
		 
	 
	
	 }
	 
	 if(!mq.isEmpty()){
		 int elem=(int)mq.remove();
		 System.out.println(elem+ " ");
		 if(!mq.isEmpty())
			 bfSearch((int)mq.peek(), visited, mq);
	 }
	 
	 
		
		
	}

}
