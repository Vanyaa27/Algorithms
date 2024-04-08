class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1){
            return 1;
        }
        if(x==-1){
            if(n%2==0){
                return 1;
            }
            else{
                return -1;
            }
        }
        if(n==1){
            return x;
        }
        if(n==-1){
            return 1/x;
        }
        if (n == Integer.MIN_VALUE) {
            x = x * x; 
            n = n / 2; 
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n; // Converting negative exponent to positive
        }
        
        double temp = myPow(x, n / 2);
        return n % 2 == 0 ? temp * temp : temp * temp * x;
    }
}
