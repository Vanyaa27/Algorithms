class Solution {
    public String countAndSay(int n) {
        if(n==1){
            String str="1";
            return str;
        }
        String str = "1";

        for(int i=2;i<=n;i++){
            StringBuilder str1 = new StringBuilder();
            int count=1;
            for(int j=1; j<str.length(); j++){
                
                if(str.charAt(j)==str.charAt(j-1)){
                    count++;
                }
                else{
                    str1.append(count).append(str.charAt(j - 1));
                    count = 1;
                }
            }
            str1.append(count).append(str.charAt(str.length() - 1));
            str= str1.toString();
        }


        return str;
    }
}
