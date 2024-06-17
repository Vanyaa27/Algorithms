import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();
		while(q-->0){
		    int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    String t = sc.nextLine();
		    String u = sc.nextLine();
		   StringBuilder str = new StringBuilder();
		   int k =0;
		   for(int i=0;i<n;i++){
		        k = (int)t.charAt(i) - (int)s.charAt(i);
		        
		       char ch = (char)('a'+ (u.charAt(i)-'a' + k +26)%26);
		       str = str.append(ch);
		   }
		 
		    System.out.println(str);
		    
		    
		    }

	}
}
