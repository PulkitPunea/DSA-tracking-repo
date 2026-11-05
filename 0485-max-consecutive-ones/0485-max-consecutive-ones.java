class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int globalMax = 0;
        int  localMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){ 
                localMax++; 
            }
            if(globalMax <= localMax){
                globalMax = localMax;
            }
            if(nums[i] != 1){
                localMax = 0;
            }
        }
        return globalMax;
    }
}