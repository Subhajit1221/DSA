class Solution {

    boolean checker(int a[], int b[]) {

        for (int i = 0; i < 256; i++) {

            if (b[i] > 0) {

                if (a[i] < b[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int high = 0;
        int low = 0;

        int s1f[] = new int[256];
        int s2f[] = new int[256];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            s1f[s1.charAt(i)]++;
        }

        while (high < s2.length()) {

            // Add current character
            s2f[s2.charAt(high)]++;

            // If checker becomes true, try shrinking
            while (checker(s2f, s1f)) {

                // If window size == s1 length,
                // then it is exactly a permutation
                if (high - low + 1 == s1.length()) {
                    return true;
                }

                // Shrink from left
                s2f[s2.charAt(low)]--;
                low++;
            }

            high++;
        }

        return false;
    }
}