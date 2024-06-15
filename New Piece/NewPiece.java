import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int p = sc.nextInt();
		 int q = sc.nextInt();
		 int res = 2;
		 if((a+b)%2!=(p+q)%2){
		     res = 1;
		 }   
		 else if(a==p && b==q){
		     res=0;
		 }
		 System.out.println(res);
		}
	}
}
