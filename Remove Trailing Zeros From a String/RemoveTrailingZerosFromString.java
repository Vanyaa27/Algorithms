class Solution {
    public String removeTrailingZeros(String num) {
       int n= num.length();
        for(int i=0;i<n;i++){
            char ch=num.charAt(n-1-i);
            if(ch!='0'){
                return num;
            }
            else{
                num = num.substring(0, num.length() - 1);
            }
        }
        return num;
    }
}
