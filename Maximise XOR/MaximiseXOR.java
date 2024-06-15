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
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            Integer[] s1 = new Integer[str1.length()];
            Integer[] s2 = new Integer[str2.length()];
            
            for (int i = 0; i < str1.length(); i++) {
                s1[i] = (int)str1.charAt(i)-48;
            }
            Arrays.sort(s1);
            for (int i = 0; i < str2.length(); i++) {
                s2[i] = (int)str2.charAt(i)-48;
            }
            Arrays.sort(s2, Collections.reverseOrder());
            Integer[] res = new Integer[s1.length];
           for(int i=0;i<s1.length;i++){
               res[i] = s1[i]^s2[i];
           }
            Arrays.sort(res, Collections.reverseOrder());
            for(int c : res){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
