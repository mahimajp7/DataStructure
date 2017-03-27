package codingBat;

import java.util.HashSet;

public class DuplicatesInArrayHashSet {

	public static void main(String[] args) {
		int [] myarray = {2,3,4,5,6,8,9,12,10,2,11};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		//Since HashSet doesn't allow duplicate elements , check for that element that doesn't get added to the set.
		for(int myint : myarray){
			if(!hs.add(myint)){ // will return false if it cannot add the duplicate element
				System.out.println("The element that cannot be in HashSet is " +myint);
			}
			
		}
		

	}

}
