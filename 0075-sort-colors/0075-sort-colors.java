class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;
        while (mid <= end) {
            if (nums[mid] == 0) {
                // swap start index to mid index
                int temp = nums[start];
                nums[start++] = nums[mid];
                nums[mid++] = temp;

                // increase mid index 
            } else if (nums[mid] == 1) {
                mid++;

                // swap mid index to end index
            } else {
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end--] = temp;
            }
        }
    }
}