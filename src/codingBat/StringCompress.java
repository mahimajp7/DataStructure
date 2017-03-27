package codingBat;

import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {
		
		System.out.println("Enter the string to compress and count every occurence : \n");

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//String input = "AAABBBBCC";

		int count = 1;

		char last = input.charAt(0);

		StringBuilder output = new StringBuilder();

		for(int i = 1; i <input.length(); i++){
		    if(input.charAt(i) == last){
		    count++;
		    }else{
		        if(count >= 1){
		            output.append(""+last+count);
		        }else{
		            output.append(last+"1");
		        }
		    count = 1;
		    last = input.charAt(i);
		    }
		}
		if(count > 1){
		    output.append(""+last+count);
		}else{
		    output.append(last);
		}
		System.out.println(output.toString());
	}

}
