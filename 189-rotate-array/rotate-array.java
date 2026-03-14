class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        // last k elements store
        for(int i = 0; i < k; i++){
            temp[i] = nums[n - k + i];
        }

        // shift remaining elements right
        for(int i = n - k - 1; i >= 0; i--){
            nums[i + k] = nums[i];
        }

        // put stored elements at beginning
        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }
    }
}