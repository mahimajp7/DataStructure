package codingBat;

import java.util.HashSet;
// Program to find the common elements between two Array of strings using Hash Set.
//Also included few operations of HashSet


public class CommonElementsHashSet {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hash = new HashSet<>();
		String [] s1 = {"abc","xyz","rst","gef","uvw","akka","appa"};
		String [] s2 = {"xyz","mno","mam","mom","akka","appa","amma"};
		for(int i = 0 ;i<s1.length;i++){
			for(int j = 0; j<s2.length; j++){
				if(s1[i].equals(s2[j])){
					hash.add(s1[i]);
				}
			}
		}
		System.out.println("Hash Set contains: "+hash);
		System.out.println("Check if the hash set contains the string in it: "+hash.contains("gef"));
		hash.remove("xyz");
		System.out.println(hash);
		System.out.println("Checking if the hash set is empty :" +hash.isEmpty());
	    
	}

}
