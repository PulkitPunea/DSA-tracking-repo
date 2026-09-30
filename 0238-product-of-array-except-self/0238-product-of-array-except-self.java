class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        
        int preFix = 1, postFix = 1;

        for(int i = 0; i < nums.length; i++){
           answer[i] = 1;
           answer[i] = preFix;
           preFix *= nums[i]; 
        }
        for(int i = nums.length - 1; i >= 0; i--){
            answer[i] *= postFix;
            postFix *= nums[i];
        }
        return answer;
    }
}