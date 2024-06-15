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
		    int n =sc.nextInt();
		    int paid = sc.nextInt();
		    int price[] = new int[n];
		    int pos[] = new int[n];
		    for(int i=0;i<n;i++){
		        price[i] = sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        pos[i] = sc.nextInt();
		    }
		    boolean found = false;
		    for(int i=0;i<n-1;i++){
		        for(int j=1+i;j<n;j++){
		            if(pos[i]!=pos[j]){
		                int diff=price[i]+price[j];
		                if((paid+diff)<=100){
		                    System.out.println("yes");
		                    found= true;
		                    break;
		                }
		            }
		        }
		        if(found){
		            break;
		        }
		    }
		    if(!found){
		        System.out.println("no");
		    }
		    
		}

	}
}
