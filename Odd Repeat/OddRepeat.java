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
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = sc.nextInt();

            int idx = 0;
            int ele[] = new int[n];
            int sum = 0;
            for (int i = 1; i <= 2 * n; i++) {
                if (i % 2 != 0) {
                    ele[idx] = i;
                    sum = sum + ele[idx];
                    idx++;
                }
            }
           // System.out.println(sum);

            
            for (int i = 0; i < n; i++) {
                int nsum = sum;
                int c = ele[i];
                nsum = sum + (c * (k - 1));
                if (nsum == s) {
                   System.out.println(c);
                   break;
                }
               // System.out.println(sum);
            }
        }
    }
}
