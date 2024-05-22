import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
		 int n = sc.nextInt();
		 int max=0;
		 for(int i=0;i<n;i++){
		     int v = sc.nextInt();
		     if(v>max){
		         max=v;
		     }
		 }
		 System.out.println(max);
		    
		}
	}
}
