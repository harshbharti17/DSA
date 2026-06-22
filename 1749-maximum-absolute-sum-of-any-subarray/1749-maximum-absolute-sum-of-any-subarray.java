class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd = nums[0];
        int minEnd = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Maximum subarray sum (Kadane)
            maxEnd = Math.max(maxEnd + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxEnd);

            // Minimum subarray sum
            minEnd = Math.min(minEnd + nums[i], nums[i]);
            minSum = Math.min(minSum, minEnd);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}