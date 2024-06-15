import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if((x%2==0 || y%2==0) && (x!=1 && y!=1)){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
