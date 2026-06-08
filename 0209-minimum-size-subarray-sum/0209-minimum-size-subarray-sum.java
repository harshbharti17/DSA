class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        // Stores minimum valid window length found
        int res = Integer.MAX_VALUE;

        // Expand window using high pointer
        while (high < nums.length) {
            sum = sum + nums[high];
            while (sum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        // If no valid subarray exists, return 0
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}