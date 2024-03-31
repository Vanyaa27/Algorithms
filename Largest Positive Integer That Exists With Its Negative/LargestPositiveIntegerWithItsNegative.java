import java.util.Arrays;
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int p=0;
        int q=nums.length-1;
        do{
            if(nums[p]==nums[q]*-1){
                return nums[q];
            }
            if(nums[p]<nums[q]*-1){
                p++;
            }
            else{
                q--;
            }
        }while(p<q);
        
        return -1;
    }
}
