class Solution {

    int findMax(int[] freq) {

        int max = 0;

        for (int i = 0; i < 256; i++) {
            max = Math.max(max, freq[i]);
        }

        return max;
    }

    public int characterReplacement(String s, int k) {

        int n = s.length();

        int[] freq = new int[256];

        int low = 0;
        int maxAnswer = 0;

        for (int high = 0; high < n; high++) {

            freq[s.charAt(high)]++;

            int maxFrequency = findMax(freq);

            int length = high - low + 1;

            int changes = length - maxFrequency;

            while (changes > k) {

                freq[s.charAt(low)]--;

                low++;

                maxFrequency = findMax(freq);

                length = high - low + 1;

                changes = length - maxFrequency;
            }

            maxAnswer = Math.max(maxAnswer, length);
        }

        return maxAnswer;
    }
}