import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int d = sc.nextInt();
	    if(n<2){
	        System.out.println(0);
	        
	    }
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]= sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int count = 0;
	    for(int i=0;i<n-1;i=i+2){
	        if((arr[i+1]-arr[i])<=d){
	            count++;
	        }
	        else{
	            i--;
	        }
	    }
	    System.out.println(count);
	}
}
