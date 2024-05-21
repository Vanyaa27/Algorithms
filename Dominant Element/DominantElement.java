import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		   
		    for(int i=0;i<n;i++){
		        arr[i]= sc.nextInt();
		    }
		    
		    HashMap <Integer, Integer> hmap = new HashMap<>();
		    for(int i=0;i<n;i++){
		        if(hmap.containsKey(arr[i])){
		            int v = hmap.get(arr[i]);
		            hmap.replace(arr[i], v+1);
		        }
		        else{
		            hmap.put(arr[i], 1);
		        }
		    }
		    int arr2[] = new int[hmap.size()];
		    
		    if(hmap.size()==1){
		        System.out.println("YES");
		        continue;
		    }
		    
		    int idx = 0;
		    for(int m : hmap.values()){
		        arr2[idx] = m;
		        idx++;
		    }
		    Arrays.sort(arr2);
		    if(arr2[idx-1]==arr2[idx-2]){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}

	}
}
