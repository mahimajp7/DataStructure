package codingBat;

public class Stringtry {

	public static void main(String[] args) {
	
		String str1 = "MyName"; 
		String str2 = new String("MyName");
		String str3 = str2;
		
		System.out.println(str3);

		if (str1 == str2) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		if (str1.equals(str2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}


	}

}
