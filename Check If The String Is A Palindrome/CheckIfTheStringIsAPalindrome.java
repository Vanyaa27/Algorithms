import java.util.* ;
import java.io.*; 
public class Solution {

	public static boolean checkPalindrome(String str) {
	
	    // WRITE YOUR CODE HERE	
		String cstr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String nstr="";
		char ch;
	 for(int i=0; i<cstr.length(); i++){
         ch= cstr.charAt(i); 
         nstr= ch+nstr;
      }
	 return nstr.equals(cstr);
	}
}
