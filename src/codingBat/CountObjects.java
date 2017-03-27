package codingBat;

public class CountObjects {
	
	static int count = 0;
	
	CountObjects(){
		
		count = count+1;
	}

	public static void main(String[] args) {
		
		CountObjects c1 = new CountObjects();
		CountObjects c2 = new CountObjects();
		//CountObjects c3 = new CountObjects();
		
		System.out.println("There are" +" "+count + " "+ "number of objects" );
	}

}
