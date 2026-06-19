// User function Template for Java

class Solution {
	static int smallestSumSubarray(int a[], int size) {
		
		int bestEnding = a[0];
		int max = a[0];
		
		for (int i = 1; i<a.length; i++) {
			bestEnding = Math.min(bestEnding + a[i], a[i]);
			
			max = Math.min(max, bestEnding);
		}
		
		return max;
	}
}
