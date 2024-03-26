class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int p=0;
        int q=1;
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               arr[p]=nums[i];
               p=p+2;
            }
            if(nums[i]%2==1){
               arr[q]= nums[i];
               q=q+2;
            }
            
        }
        return arr;
    }
}
