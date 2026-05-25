class Solution {
	ArrayList<Integer> removeDuplicates(int[] arr) {
		
		int off = 0;
		int cm = 1;
		
		while (cm < arr.length) {
			
			if (arr[cm] == arr[cm - 1]) {
				cm++;
				continue;
			}
			
			arr[off + 1] = arr[cm];
			off++;
			cm++;
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		
		for (int i = 0; i <= off; i++) {
			res.add(arr[i]);
		}
		
		return res;
	}
}
