import java.util.*; 
import java.util.Arrays;
public class Solution{  

    public static int findUnique(int[] arr){
		
   int n = arr.length;
    Arrays.sort(arr);
    for(int i=0;i<n;i+=2){
     if (i==n-1 || arr[i]!=arr[i+1]){
       return arr[i];
      }
    }
    return -1;
  }
}
