class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int n=s.length()-1;
        int m=n;
        while (n >= 0 && s.charAt(n) == ' ') {
            n--; 
        }
        while(n>=0 && s.charAt(n)!=' '){
            count++;
            n--;
        }
        return count;
    }
}
