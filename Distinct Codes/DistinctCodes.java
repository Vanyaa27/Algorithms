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
        while(t-->0){
            String str = sc.nextLine();
            int n = str.length();
            ArrayList<String> arr = new ArrayList<>();
            for(int i=1;i<n;i++){
                StringBuilder str1 = new StringBuilder();
                
                str1.append(str.charAt(i-1)).append(str.charAt(i));
                if(!arr.contains(str1.toString())){
                    arr.add(str1.toString());
                }
               
            }
            System.out.println(arr.size());
            
        }

	}
}
