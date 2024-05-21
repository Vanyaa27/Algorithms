import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
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
	     
	      HashMap<Integer , Integer> hmap = new HashMap<>();
	      
	      for(int i=0;i<n;i++){
	        if(hmap.containsKey(arr[i])){
	          int v = hmap.get(arr[i]);
	          hmap.replace(arr[i], v+1);
	        }
	        else{
	            hmap.put(arr[i], 1);
	        }
	      }
	      
	      int max=1;
	      for(int i : hmap.values()){
	          if(i>max){
	              max = i;
	          }
	      }
	      
	       int m = n - max ;
	      System.out.println(m);
	  }
	}
}
