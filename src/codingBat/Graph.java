package codingBat;

import java.util.LinkedList;

public class Graph {
	
	private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List
    boolean visited[];
    //Constructor
    Graph(int v)
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

	

}
