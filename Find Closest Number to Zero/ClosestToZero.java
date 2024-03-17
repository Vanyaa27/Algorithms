class Solution {
    public int findClosestNumber(int[] nums) {
        int min= nums[0];
        int dis= nums[0]-0;
        if(dis<0){
                dis=dis*-1;
            }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            int dis2=nums[i]-0;
            int dis3=dis2;
            if(dis2<0){
                 dis2=dis2*-1;
            }
            if(-min==dis3 && min>0){
                continue;
            }
            if(dis2<=dis){
                dis=dis2;
                min= nums[i];
            }
        }
        return min;
    }
}
