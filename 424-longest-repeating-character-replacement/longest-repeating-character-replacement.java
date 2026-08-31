class Solution {

    public int characterReplacement(String s, int k) {

        int n = s.length();

        int[] freq = new int[26];

        int low = 0;
        int maxAnswer = 0;
        int maxFrequency = 0;

        for (int high = 0; high < n; high++) {

            freq[s.charAt(high) - 'A']++;

            maxFrequency = Math.max(
                maxFrequency,
                freq[s.charAt(high) - 'A']
            );

            while (high - low + 1 - maxFrequency > k) {

                freq[s.charAt(low) - 'A']--;

                low++;
            }

            maxAnswer = Math.max(
                maxAnswer,
                high - low + 1
            );
        }

        return maxAnswer;
    }
}