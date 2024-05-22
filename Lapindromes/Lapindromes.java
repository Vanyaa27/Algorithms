import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int k = 0; k < t; k++) {
            String str = sc.nextLine();
            int n = str.length();
            if (n == 1) {
                System.out.println("YES");
            }
            else {
                ArrayList<Character> arr = new ArrayList<Character>();
                for(int i=0; i<n/2; i++){
                  arr.add(str.charAt(i)); 
                }
                for(int j=n-1; j>=(n+1)/2;j--){
                    if(arr.contains(str.charAt(j))){
                        arr.remove((Character)str.charAt(j));
                    }
                }
                if(arr.size()>=1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            
        }
    }
}
