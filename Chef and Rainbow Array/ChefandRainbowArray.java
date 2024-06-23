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
            int exp = 1;
            int n = sc.nextInt();
            int arr[] = new int[n];
            boolean found = false;
             int m = n;
            
            if (n % 2 == 0) {
                m = n - 1;
            }
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i <= n / 2; i++) {
                if (arr[i] == exp) {
                    exp++;
                } else if (arr[i] == exp - 1) {
                    continue;
                } else {
                    System.out.println("no");
                    found = true;
                    break;
                }
            }
            if(exp!=8 && !found){
                System.out.println("no");
                found = true;
                
            }
           
            if (!found) {
                for (int i = 0; i < (m / 2) + 1; i++) {
                    if (arr[i] != arr[n - i-1]) {
                        System.out.println("no");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("yes");
                }
            }

        }

    }
}
