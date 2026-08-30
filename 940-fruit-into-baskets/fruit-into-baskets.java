class Solution {
    public int totalFruit(int[] fruits) {

        int[] count = new int[fruits.length + 1];

        int low = 0;
        int types = 0;
        int max = 0;

        for (int high = 0; high < fruits.length; high++) {

            if (count[fruits[high]] == 0) {
                types++;
            }

            count[fruits[high]]++;

            while (types > 2) {

                count[fruits[low]]--;

                if (count[fruits[low]] == 0) {
                    types--;
                }

                low++;
            }

            max = Math.max(max, high - low + 1);
        }

        return max;
    }
}