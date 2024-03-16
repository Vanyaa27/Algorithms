import java.lang.Math;
public class Solution {
    public static int NthRoot(int n, int m) {
        for(int i=0;i<m;i++){
            if(Math.pow(i, n)==m){
                return i;
            }
        }
        return -1;
    }
}
