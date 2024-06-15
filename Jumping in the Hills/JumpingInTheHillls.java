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
	    int n = sc.nextInt();
	 	int u = sc.nextInt();
	    int d = sc.nextInt();	 	    
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int count = 1;
	    boolean prch = false;
	    for(int i=0; i<n-1;i++){
	        if((arr[i]-arr[i+1]<=d && arr[i]-arr[i+1]>=0)||(arr[i+1]-arr[i]<=u && arr[i+1]-arr[i]>=0)){
	            count++;
	        }
	        else{
	            if(arr[i]-arr[i+1]>d && prch==false){
	                count++;
	                prch = true;
	            }
	            else{
	                break;
	            }
	        }
	    }
	    System.out.println(count);
	}
	}
}
