class Solution {

    boolean checker(int a[], int b[]) {

        for (int i = 0; i < 256; i++) {
            
            if(b[i]>0){
                if (a[i] < b[i]) {
                return false;
            }

            }
            
        }

        return true;
    }

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        StringBuilder sb = new StringBuilder("");

        int tf[] = new int[256];
        int sf[] = new int[256];

        for (int i = 0; i < t.length(); i++) {
            tf[t.charAt(i)]++;
        }

        int high = 0;
        int low = 0;
        int min = Integer.MAX_VALUE;
        int res = 0;

        while (high < s.length()) {

            sf[s.charAt(high)]++;

            while (checker(sf, tf)) {

                if (min > high - low + 1) {
                    min = high - low + 1;
                    res = low;
                }

                sf[s.charAt(low)]--;
                low++;
            }

            high++;
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }

        while (min != 0) {
            sb.append(s.charAt(res));
            res++;
            min--;
        }

        return sb.toString();
    }
}