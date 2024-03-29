import java.util.* ;
import java.io.*; 

public class Solution {
	public static long maxSubarraySum(int[] arr, int n) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length ; i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            if(cs>ms){
                ms = cs;
            }
        }
        return ms;
    }
}
