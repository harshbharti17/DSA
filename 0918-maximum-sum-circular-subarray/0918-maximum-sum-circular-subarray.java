class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Maximum subarray sum (Kadane)
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curMax);

            // Minimum subarray sum (Kadane)
            curMin = Math.min(curMin + nums[i], nums[i]);
            minSum = Math.min(minSum, curMin);

            total += nums[i];
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of normal subarray and circular subarray
        return Math.max(maxSum, total - minSum);
    }
}