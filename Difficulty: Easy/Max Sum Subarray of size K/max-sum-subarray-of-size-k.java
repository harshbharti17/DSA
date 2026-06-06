class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		// Code here
		int low = 0 ;
		int high = k - 1;
		int sum = 0;
		int maxSum = 0;
		
		// sum of first k elements
		for (int i = 0; i <= high; i++) {
			sum = sum + arr[i];
		}
		
		while (high < arr.length) {
			maxSum = Math.max(maxSum, sum);
			low++;
			high++;
			
			if (high == arr.length) {
				break;
			}
			// Previous window ke first element ko remove karo
			// Aur naye element ko add karo
			sum = sum - arr[low - 1] + arr[high];
		}
		return maxSum;
	}
}
