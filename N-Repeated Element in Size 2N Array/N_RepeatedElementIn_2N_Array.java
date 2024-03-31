class Solution {
    public int repeatedNTimes(int[] nums) {
        int n= nums.length;
        int r=1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    r++;
                    if(r==n/2){
                        return nums[i];
                    }
                }
            }
        }
        return -1;
    }
}
