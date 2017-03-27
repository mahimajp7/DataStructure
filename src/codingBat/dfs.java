package codingBat;

import java.util.ArrayList;
import java.util.HashMap;

public class dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm=new HashMap();
ArrayList edgeA=new ArrayList();
//		edgeA.add(2);
//		edgeA.add(3);
		hm.put(1, edgeA);
ArrayList edgeB=new ArrayList();
		
		//edgeB.add(1);
		edgeB.add(3);
		hm.put(2, edgeB);
ArrayList edgeC=new ArrayList();
		
		edgeC.add(4);
		//edgeC.add(2);
		hm.put(3, edgeC);
ArrayList edgeD=new ArrayList();
		
		edgeD.add(2);
		edgeD.add(3);
		hm.put(4, edgeD);
		//System.out.println(edgeD);
		int length=hm.size();
		int visited[]=new int[length];
		//System.out.println(hm);
		for(int i=0;i<length;i++)
			visited[i]=0;
		for(int i=0;i<hm.size();i++){
			if(visited[i]==0)
				dfs(hm,i+1,visited);
		}
		
		//System.out.println(((ArrayList)hm.get(1)).size());
		
	}

	private static void dfs(HashMap hm, int start,int[] visited) {
		// TODO Auto-generated method stub
		
		visited[start-1]=1;
		System.out.println(start);
		ArrayList<Integer> adj=new ArrayList<Integer>();
		adj=(ArrayList) hm.get(start);
		for(Integer ed:adj){
			if(visited[ed-1]!=1)
				dfs(hm,ed,visited);
		}
	}

}