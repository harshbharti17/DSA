class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int currentSum = 0;
        // Stores minimum valid window length found
        int minLenWindow = Integer.MAX_VALUE;

        // Expand window using high pointer
        while (high < nums.length) {
            currentSum = currentSum + nums[high];
            while (currentSum >= target) {
                int currentWindowSize = high - low + 1;
                minLenWindow = Math.min(minLenWindow, currentWindowSize);
                currentSum = currentSum - nums[low];
                low++;
            }
            high++;
        }
        // If no valid subarray exists, return 0
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}