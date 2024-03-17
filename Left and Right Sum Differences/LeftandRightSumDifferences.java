class Solution {
    public int[] leftRightDifference(int[] nums) {
       int n=nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
         leftSum[0]=0;
         rightSum[n-1]=0;
        
        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+ nums[i-1];
            rightSum[n-i-1]=rightSum[n-i]+ nums[n-i];
        }
        int[] ans= new int[n];
        for(int j=0;j<n;j++){
            ans[j]=leftSum[j] - rightSum[j];
            if(ans[j]<0){
                ans[j]= ans[j]*-1;
            }
        }
        return ans;
    }
}
