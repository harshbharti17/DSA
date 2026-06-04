class Solution {
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		// code here
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		if (arr.length<1) {output.add(-1) ; }
		else {
			boolean sequenceFound = false;
			int sum = 0;
			int left = 0;
			
			for (int right = 0; right<arr.length; right++) {
				sum += arr[right];
				while (sum>target && left <= right) {
					sum -= arr[left];
					left++;
				}
				if (sum == target) {
					output.add(left + 1);
					output.add(right + 1);
					return output;
				}
			}
			
		}
		output.add(-1);
		return output;
	}
}
