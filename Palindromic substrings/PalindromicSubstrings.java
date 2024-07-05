import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String str1 = sc.nextLine();
		    String str2 = sc.nextLine();
		    boolean found = false;
		    for(int i=0;i<str1.length();i++){
		        char ch=str1.charAt(i);
		        for(int j=0;j<str2.length();j++){
		            if(ch==str2.charAt(j)){
		                found=true;
		                break;
		            }
		            
		        }
		        if(found){
		            break;
		        }
		    }
		    if(found){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
