class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int max = 0;

        while (high < fruits.length) {

            // Add the current fruit
            if (map.containsKey(fruits[high])) {
                map.put(fruits[high], map.get(fruits[high]) + 1);
            } else {
                map.put(fruits[high], 1);
            }

            high++;

            // Too many fruit types
            while (map.size() > 2) {

                map.put(fruits[low], map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }

                low++;
            }

            // Window now has at most 2 types
            max = Math.max(max, high - low);
        }

        return max;
    }
}