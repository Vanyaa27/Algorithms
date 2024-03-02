import java.util.* ;
import java.io.*; 
public class Solution {
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.
		Arrays.sort(arr);
		for(int j=0;j<n-1;j++){
			if(arr[j]+1!=arr[j+1]&& arr[j]>0){
				return arr[j] + 1;
			}
		}
		int k=arr[n-1]+1;
		return k;		
	}
}
