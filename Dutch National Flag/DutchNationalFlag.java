class Solution {
    public void sort012(int[] nums) {
        int p=0;
        int n= nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                p++;
            }
            if(nums[i]>nums[i+1]){
               if(nums[i+1]==0){
                int temp= nums[i+1];
                nums[i+1] = nums[p];
                nums[p] = temp;
                p++;
               }
               else{
                   int temp2=nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp2;
                }
            }
        }
        for(int j=p;j<nums.length;j++){
            if(nums[j]==1){
                int temp3 = nums[j];
                nums[j]=nums[p];
                nums[p]= temp3;
                p++;
            }
            
        }
    }
}
