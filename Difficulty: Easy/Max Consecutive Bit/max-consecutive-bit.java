class Solution {
    public int maxConsecBits(int[] arr) {
        int maxCount = 0;
        int count1 = 0;
        int count0 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count1++;
                count0 = 0;
            } else {
                count0++;
                count1 = 0;
            }
            maxCount = Math.max(maxCount, Math.max(count1, count0));
        }

        return maxCount;
    }
}