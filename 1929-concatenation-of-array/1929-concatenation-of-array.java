class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        for(int i = 0; i < nums.length; i ++){
            ans[i] = nums[i]; 
        }
        int count = 0;
        for(int i = ans.length/2; i < ans.length; i++){
            ans[i] = nums[count];
            count++; 
        }
        return ans;
    }
}