import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x%2!=0){
		        System.out.println("NO");
		        continue;
		    }
		    if(y%2==1 && x==0){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		    
		}

	}
}
