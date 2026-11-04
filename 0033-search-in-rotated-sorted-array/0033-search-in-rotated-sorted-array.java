class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // We still check mid first because it's the fastest way to exit if we find it
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is perfectly sorted
            if (nums[low] <= nums[mid]) {
                // Check if the target fits perfectly within the left half's boundaries
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // Eliminate right half
                } else {
                    low = mid + 1;  // Eliminate left half
                }
            } 
            // Otherwise, the right half must be perfectly sorted
            else {
                // Check if the target fits perfectly within the right half's boundaries
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // Eliminate left half
                } else {
                    high = mid - 1; // Eliminate right half
                }
            }
        }

        // Target was not found in the array
        return -1;
    }
}