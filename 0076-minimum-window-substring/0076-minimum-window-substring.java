class Solution {
    public String minWindow(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        // Store frequency of characters in 't'
        for (char ch : t.toCharArray()) {
            mapT[ch]++;
        }

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        // Expand window
        for (int right = 0; right < s.length(); right++) {

            mapS[s.charAt(right)]++;

            // Shrink window while it remains valid
            while (contains(mapS, mapT)) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                mapS[s.charAt(left)]--;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    // Check if current window contains all characters of 't'
    private boolean contains(int[] mapS, int[] mapT) {
        for (int i = 0; i < 256; i++) {
            if (mapS[i] < mapT[i]) {
                return false;
            }
        }
        return true;
    }
}