class Solution {
    public int candy(int[] ratings) {

        int size = ratings.length;
        if (size == 1) return 1;

        int[] candy = new int[size];

        // Step 1: initialize all with 1
        for (int i = 0; i < size; i++) {
            candy[i] = 1;
        }

        // Step 2: left → right (ONLY compare with left)
        for (int i = 1; i < size; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Step 3: right → left (ONLY compare with right)
        for (int i = size - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        // Step 4: sum
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += candy[i];
        }

        return sum;
    }
}