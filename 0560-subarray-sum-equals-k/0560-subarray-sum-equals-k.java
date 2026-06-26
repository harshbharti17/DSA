class Solution {
    public int subarraySum(int[] nums, int k) {

        // Stores (prefixSum, frequency)
        Map<Integer, Integer> sumCount = new HashMap<>();

        // Prefix sum 0 occurs once before starting
        sumCount.put(0, 1);

        int sum = 0; // Running prefix sum
        int res = 0; // Number of valid subarrays

        for (int i = 0; i < nums.length; i++) {

            // Update current prefix sum
            sum += nums[i];

            // If (currentSum - k) exists,
            // then a subarray with sum k is found
            if (sumCount.containsKey(sum - k)) {
                res += sumCount.get(sum - k);
            }

            // Store/update current prefix sum frequency
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
}