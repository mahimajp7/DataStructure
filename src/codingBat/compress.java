package codingBat;

import java.util.Scanner;

public class compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//String input = "AAABBBBCC";

		int count = 1;

		char last = input.charAt(0);

		StringBuilder output = new StringBuilder();

		for(int i = 1; i < input.length(); i++){
		    if(input.charAt(i) == last){
		    count++;
		    }else{
		        if(count > 1){
		            output.append(""+last+count);
		        }else{
		            output.append("1"+last);
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
