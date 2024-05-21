import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

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
            
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            
            for(int j=0;j<n;j++){
                if(arrlist.contains(arr[j])){
                    continue;
                }
                else{
                    arrlist.add(arr[j]);
                }
            }
            int size = arrlist.size();
            System.out.println(size);
        }
	}
}
