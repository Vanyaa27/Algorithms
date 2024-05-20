class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        if(nums[0]>1){
                return 1;
            }
		for(int j=0;j<n-1;j++){
           
           if(nums[j]==nums[j+1]){
            continue;
           }
           if(nums[j]<1 && nums[j+1]>1){
            return 1;
           }
           if(nums[j]!=nums[j+1]-1 && nums[j]>0){
            return nums[j] +1;
           }
		}
		int k=nums[n-1]+1;
        if(k<1){
            return 1;
        }
		return k;
    }
}
