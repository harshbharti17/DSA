class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);

        int ans = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int remainder = sum % k;

            // Handle negative remainder
            if (remainder < 0) {
                remainder += k;
            }

            // If this remainder has appeared before,
            // all previous occurrences form valid subarrays.
            if (sumCount.containsKey(remainder)) {
                ans += sumCount.get(remainder);
            }

            // Increase frequency of current remainder
            sumCount.put(remainder, sumCount.getOrDefault(remainder, 0) + 1);
        }

        return ans;
    }
}