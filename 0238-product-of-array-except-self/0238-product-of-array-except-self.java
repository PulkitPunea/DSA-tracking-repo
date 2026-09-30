class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        // Single variable to track the running product for both passes
        int runningProduct = 1; 
        
        // First pass: Store the prefix product for each index
        for(int i = 0; i < nums.length; i++){
            answer[i] = runningProduct; 
            runningProduct *= nums[i];  
        }
        
        // Reset the running product to 1 before starting the backward pass
        runningProduct = 1;
        
        // Second pass: Multiply the existing prefix product by the postfix product
        for(int i = nums.length - 1; i >= 0; i--){
            answer[i] *= runningProduct; 
            runningProduct *= nums[i];   
        }
        return answer;
    }
}