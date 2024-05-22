import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
            int n = sc.nextInt();
            
            HashSet<Integer> arr = new HashSet<Integer>();
            for(int i=0;i<n;i++){
             int d = sc.nextInt();
             arr.add(d);
             
            }
            
            int p = arr.size();
            if(p%2==0){
                System.out.println("YES");
            }
            else if(p==n){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
		}
	}
}
