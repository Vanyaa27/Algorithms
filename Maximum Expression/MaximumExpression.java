import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int k=0; k<t; k++){
		    int n = sc.nextInt();
		    sc.nextLine();
		     String str = sc.nextLine();
		        ArrayList<Character> arr = new ArrayList<Character>();
		        
		        int plus=0;
		        int minus = 0;
		        for(int i=0;i<n;i++){
		            if(str.charAt(i)=='+'){
		                plus++;
		            }
		            else if(str.charAt(i)=='-'){
		                minus++;
		            }
		            else{
		                char b=str.charAt(i);
		              //  int a=String.valueOf(b));
		                arr.add(b);
		            }
		            
		        }
		        Collections.sort(arr, Collections.reverseOrder());
		   
		   int m = arr.size() -minus-plus;
		    StringBuilder str1 = new StringBuilder();
		    for(int i=0;i<m;i++){
		      str1.append(arr.get(i));   
		    }
		    int g=0;
		    for(int i=0;i<plus;i++){
		        
		        str1.append('+').append(arr.get(m+g));
		        g++;
		        
		    }
		    
		    for(int i=0;i<minus;i++){
		        str1.append('-').append(arr.get(m+g));
		        g++;
		       
		    }
		    System.out.println(str1);
		}

	}
}
