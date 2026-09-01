class Solution {

    boolean checker(int a[], int b[]) {

        for (int i = 0; i < 256; i++) {

            
                if (a[i] != b[i]) {
                    return false;
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

        int s2f[] = new int[256];
        int s1f[] = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            s1f[s1.charAt(i)]++;
        }

        while (high < s2.length()) {

            s2f[s2.charAt(high)]++;

            while (high - low + 1 > s1.length()) {

               

                s2f[s2.charAt(low)]--;
                low++;

                

            }

             if (checker(s2f,s1f)) {
                    return true;
                }

            high++;
        }

        return false;
    }
}