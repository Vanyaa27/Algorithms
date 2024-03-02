import java.util.Arrays;
public class Solution {
    public static int[] Klargest(int[] a, int k, int n) {
        // Write your code here
        int[] arr=new int[k];
        if(k==n){
            Arrays.sort(a);
            return a;
        }
        else{
            
            Arrays.sort(a);
            for(int i=0;i<k;i++){
                arr[i]=a[n-k+i];
            }
        }
        return arr;
    }
}
