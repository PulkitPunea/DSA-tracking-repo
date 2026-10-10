class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum = 0;
        int globalMaxSum = nums[0]; 

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            if (runningSum > globalMaxSum) {
                globalMaxSum = runningSum;
            }
            
            if (runningSum < 0) {
                runningSum = 0;
            }
        }
        
        return globalMaxSum;
    }
}
