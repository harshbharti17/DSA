class Solution {
    public int totalFruit(int[] fruits) {

        int low = 0;
        int maxFruits = 0;

        // Stores fruit type and its count in the current window
        Map<Integer, Integer> basket = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {

            // Add current fruit to the basket
            int currentCount = basket.getOrDefault(fruits[high], 0);
            basket.put(fruits[high], currentCount + 1);

            // Shrink the window if more than 2 fruit types exist
            while (basket.size() > 2) {

                int fruitCount = basket.get(fruits[low]);

                // Remove fruit type if its count becomes 0
                if (fruitCount == 1) {
                    basket.remove(fruits[low]);
                } else {
                    basket.put(fruits[low], fruitCount - 1);
                }

                low++;
            }
            // Update maximum valid window size
            maxFruits = Math.max(maxFruits, high - low + 1);
        }
        return maxFruits;
    }
}