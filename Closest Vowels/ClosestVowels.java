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
            sc.nextLine();
            String str = sc.nextLine();
            long count = 1L;
            final int MOD = 1000000007;
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                
                if (ch == 'c' || ch == 'g' || ch == 'l' || ch == 'r') {
                    count = (count * 2)%MOD;
                }
                
            }
            System.out.println(count);
        }

    }
}
