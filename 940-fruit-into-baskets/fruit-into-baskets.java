class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int max = 0;

        while (high < fruits.length) {

            if (map.containsKey(fruits[high])) {
                map.put(fruits[high], map.get(fruits[high]) + 1);
            } else {
                map.put(fruits[high], 1);
            }

            

            while (map.size() > 2) {

                map.put(fruits[low], map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }

                low++;
            }

            
                max = Math.max(max, high - low+1);
            

            high++;
        }

        return max;
    }
}