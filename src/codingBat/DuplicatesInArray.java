package codingBat;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int [] myarray = {2,3,4,5,6,8,9,12,6,11};
		
		for(int i=0; i<myarray.length-1; i++){
			for(int j = i+1; j<myarray.length; j++){
				
				if(myarray[i]==myarray[j])
				{
					System.out.println("The Duplicate element is in the index position "+j);
				}
			}
		}

	}

}
