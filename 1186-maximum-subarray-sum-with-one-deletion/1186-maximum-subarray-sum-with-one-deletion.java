class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(noDelete + arr[i], arr[i]);

            int v2;
            if (prevNoDelete == Integer.MIN_VALUE) {
                v2 = arr[i];
            } else {
                v2 = prevOneDelete + arr[i];
            }
            
            oneDelete = Math.max(v2, prevNoDelete);

            res = Math.max(res, Math.max(noDelete, oneDelete));

        }
        return res;

    }
}