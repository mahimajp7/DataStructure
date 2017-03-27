package codingBat;

public class CheckPalindrome {
	
	boolean isPalindrome(String inputword){
// First find the length of the input word, last character of the word.
		
		int wordlength = inputword.length();
		int lastchar = wordlength-1;
		//Loop only till the middle of the word by comparing the first character and the last character of the word.
		for(int i=0; i<wordlength/2; i++){
			if(inputword.charAt(i)!=inputword.charAt(lastchar-i)){
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		CheckPalindrome chk = new CheckPalindrome();
		boolean result = chk.isPalindrome("abcba");
		System.out.println(result);

	}

}
