import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
       Scanner sc = new Scanner(System.in);
       
       int t = sc.nextInt();
     for(int k=0;k<t;k++){
       int n = sc.nextInt();
       int[] arr= new int[n];
       for(int i=0;i<n;i++){
           arr[i]= sc.nextInt();
       }
      // arr[n]=-100;
       Arrays.sort(arr);
       boolean found = false;
       for(int j=1;j<n;j+=2){
           if(arr[j]!=arr[j-1]){
               System.out.println(arr[j-1]);
               found = true;
               break;
           }
       }
       if(!found){
           System.out.println(arr[n-1]);
           
       }
     } 
    }
}
