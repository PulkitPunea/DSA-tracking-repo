class Solution {
    public int findMin(int[] nums) {
        
        int high = nums.length-1,
            mid = 0,
            low = 0;
        
        int globalLow = Integer.MAX_VALUE;

        while(low <= high){
            mid = (high + low) / 2;
            
            if(nums[mid]>=nums[low]){
                if(nums[low] < globalLow){
                    globalLow = nums[low];
                }
                low = ++mid;
            }
            else{
                if(nums[mid] < globalLow){
                    globalLow = nums[mid];
                }
                high = --mid;
            }
        }
        return globalLow;
    }
}