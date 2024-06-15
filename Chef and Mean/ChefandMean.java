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
            int arr[] = new int[n];
            long sum = 0L;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double mean = (double)sum / n;
            boolean found = false;
             // System.out.println(mean);
             
            for (int i = 0; i < n; i++) {
                double newmean = (double)(sum - arr[i]) /(n - 1);
                 if(newmean==mean){
                    System.out.println(i + 1);
                    found = true;
                   // System.out.println(newmean);
                    break;
                }
             //   System.out.println(newmean);
            }
            if (!found) {
                System.out.println("Impossible");
                
            }
        }

    }
}
