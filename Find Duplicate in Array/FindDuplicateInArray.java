import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        ArrayList<Integer> check = new ArrayList<Integer>();

        for(int i=0; i<n ; i++){
            if(i==0){
                check.add(arr.get(i));
            }
            else {
                if(check.contains(arr.get(i))){
                     return(arr.get(i));
                 }
                else{
                    check.add(arr.get(i));
                 }
            }
        }
        return -1;
    }
}
