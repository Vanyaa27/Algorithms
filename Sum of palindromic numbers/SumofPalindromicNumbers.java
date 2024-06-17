import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for (int i = a; i <= b; i++) {
                if(isPal(i)){
                    sum += i;
                    }
            }
            System.out.println(sum);
        }

    }
    public static boolean isPal(int n){
        int org = n;
        if(n<10){
            return true;
        }
        int rev = 0;
        while(n!=0){
            int r = n%10;
            rev = (rev*10) + r;
            n = n/10;
        }
        return rev==org ;
        
    }
}
