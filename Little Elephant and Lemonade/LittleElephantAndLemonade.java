import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
        while(t-- > 0){
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int pos[] = new int[m];
            int count[] = new int[n];
            for(int i=0;i<m;i++){
                pos[i]= sc.nextInt();
                 count[pos[i]]++;
            } 
            //System.out.println(count[3]);
            sc.nextLine(); // consuming line
            
            int sum=0;
            for(int i=0;i<n;i++){
                int p=sc.nextInt();
                int pr[] = new int[p];
                for(int j=0;j<p;j++){
                    pr[j] = sc.nextInt();
                }
               
                Arrays.sort(pr);
                for(int k=p-1;k>=p-count[i] && k>-1;k--){
                    sum += pr[k];
                }
             }
            
           System.out.println(sum);
            
        }
	}
}
