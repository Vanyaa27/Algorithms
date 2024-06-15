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
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            if (a == b || a%b==0) {
                System.out.println(-1);
                continue;
            }
            
            if(n%a!=0){
                n = ((n/a) + 1)*a;
            }
            boolean found = false;
            while (!found ) {
                if (n % b != 0) {
                    System.out.println(n);
                    found = true;
                    break;
                }
                n = n+a;
            }
            if(!found){
                System.out.println(-1);
            }
        }
    }
}
