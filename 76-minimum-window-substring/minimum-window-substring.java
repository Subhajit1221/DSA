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

        int tsize= t.length();
        int ssize= s.length();

        if (ssize < tsize) {
            return "";
        }

        

        int tf[] = new int[256];
        int sf[] = new int[256];

        for (int i = 0; i < tsize; i++) {
            tf[t.charAt(i)]++;
        }

        int high = 0;
        int low = 0;
        int min = Integer.MAX_VALUE;
        int res = 0;

        while (high < ssize) {

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

        StringBuilder sb = new StringBuilder("");

        while (min != 0) {
            sb.append(s.charAt(res));
            res++;
            min--;
        }

        return sb.toString();
    }
}