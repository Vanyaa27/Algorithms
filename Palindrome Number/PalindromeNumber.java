class Solution {
    public boolean isPalindrome(int x) {
        int k=x;
        int rev=0;
        int rem=0;
        if(x<0){
            return false;
        }
        while (x!=0){
           rem = x%10;
            rev = rev*10 + rem;
            x=x/10;
        }
        if(k==rev){
            return true;
        }
        return false;
    }
}
