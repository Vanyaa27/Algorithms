import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consuming line
        
        while(t-->0){
            int sum =0 ;
            String str = sc.nextLine();
            int arr[] = new int[str.length()];
            for(int i=0;i<str.length();i++){
                arr[i]= (int)str.charAt(i) - 96;
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                sum = sum+ (i+1)*arr[i];
            }
            System.out.println(sum);
        }
       // System.out.println(sum);
	}
}
