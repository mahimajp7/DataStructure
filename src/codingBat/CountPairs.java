package codingBat;


//Given an array and a sum , find and count the pairs that sums to that sum.
public class CountPairs {

	public static void main(String[] args) {
		int [] myarray = { 1,2,5,8,11,15,16,4};
		int sum = 12;
		getPairsCount(myarray,sum);
		

	}

	private static void getPairsCount(int[] myarray, int sum) {
		int count = 0;
		//To consider all the pairs and check their sums
		
		for(int i = 0 ; i<myarray.length ; i++){
			for(int j = 0; j< myarray.length ; j++){
				if(myarray[i]+myarray[j]==sum){
					System.out.print("(" +myarray[i] +"," +myarray[j] +")\n");
					count++;
					
				}
			}
		}
		System.out.println("The total number of pairs :" +count);
	}

}
