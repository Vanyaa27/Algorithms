import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        for(int i =0;i<n-1;i++){
            int t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        return arr;
        }

    }
