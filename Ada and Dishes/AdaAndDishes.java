import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while(k-->0){
		    int n = sc.nextInt();
		    int arr[]= new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		   // int t= 0;
		    if(n==1){
		        System.out.println(arr[0]);
		        continue;
		    }
		    if(n==2){
		        System.out.println(arr[1]);
		        continue;
		    }
		    if(n==3){
		        System.out.println(Math.max(arr[0]+arr[1],arr[2]));
		        continue;
		    }
		    if(n==4){
		       
		       int p =arr[n-2];
		       int t = arr[n-1];
		       int m = Math.min(t,p);
		       for(int i=n-3;i>-1;i--){
		           
		           p = Math.min(m,t);
		           t = Math.max(t,m);
		           m = p+arr[i];
		           }
		           t= Math.max(t,m);
		       System.out.println(t);
		    }
		}

	}
}
