import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    sc.nextLine();
		    int arr[]= new int[n];
		    String str = sc.nextLine();
		    for(int i=0;i<n;i++){
		        arr[i]= (int)str.charAt(i);
		    }
		    for(int i=0;i<n/2;i++){
		        if(arr[i]>arr[n-1-i]){
		            int temp = arr[i];
		            arr[i] = arr[n-1-i];
		            arr[n-1-i] = temp;
		        }
		    }
		    boolean found = false;
		    for(int i=1;i<n;i++){
		        if(arr[i-1]>arr[i]){
		            found = true;
		            break;
		        }
		    }
		    if(found){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
		}

	}
}
