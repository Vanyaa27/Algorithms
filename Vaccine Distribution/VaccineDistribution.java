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
		    int d = sc.nextInt();
		   // int arr[] = new int[n];
		   int risk = 0, nrisk = 0;
		    for(int i=0;i<n;i++){
		        int val = sc.nextInt();
		        if(val<10 || val>79){
		            risk++;
		        }
		        else{
		            nrisk++;
		        }
		    }
		    int days = ((risk)/d) + ((nrisk)/d);
		    
		    if(risk%d!=0){
		        days++ ;
		    }
		    if(nrisk%d!=0){
		        days++ ;
		    }
		    
		    System.out.println(days);
		}

	}
}
