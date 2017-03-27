package codingBat;

public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(HammingDistance(1,3));
	
		}
	

	private static int HammingDistance(int i, int j) {
		
		return Integer.bitCount(i ^ j);
//*****IMPORTANT*****//Integet.bitCount will count the number of 1's after doing an XOR of two binary digits.
	}

}
