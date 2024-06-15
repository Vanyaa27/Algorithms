import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
  {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    int party[] = new int[3];
		    int actual[] = new int[3];
		    int sum = 0;
		    for(int i=0;i<3;i++){
		        party[i] = sc.nextInt();
		        sum += party[i];
		    }
		    int tvotes =0;
		    for(int i =0;i<3;i++){
		        actual[i] = sc.nextInt();
		        tvotes += actual[i]; 
		    }
		    boolean found = false;
		    tvotes = tvotes/2;
		    for(int i=0;i<3;i++){
		        int csum = sum;
		        csum = csum - party[i] + actual[i];
		        if(csum>tvotes){
		            System.out.println("YES");
		            found = true;
		            break;
		        }
		    }
		    if(!found){
		        System.out.println("NO");
		    }
		    
		    
		}

	}
}
