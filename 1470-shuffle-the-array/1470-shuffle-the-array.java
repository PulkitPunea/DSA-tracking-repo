class Solution {
    public int[] shuffle(int[] nums, int n) {
        // 1. Initialize the answer array to exactly match the input size (2 * n)
        int[] ans = new int[2 * n];
        
        // 2. Loop exactly n times, grabbing one X and one Y pair per loop
        for (int i = 0; i < n; i++) {
            // 3 & 4. Calculate write indexes dynamically based on i, and read from 0 and n
            ans[2 * i] = nums[i];         // Place the X element
            ans[2 * i + 1] = nums[n + i]; // Place the corresponding Y element
        }
        
        return ans;
    }
}