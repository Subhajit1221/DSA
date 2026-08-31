class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }

        int c[] = new int[128];

        int low = 0;
        int high = 0;
        int max = Integer.MIN_VALUE;

        while (high < s.length()) {

            if (c[s.charAt(high)] == 0) {

                c[s.charAt(high)] = 1;
                high++;

            } else {

                while (c[s.charAt(high)] == 1) {
                    c[s.charAt(low)] = 0;
                    low++;
                }
            }

            max = Math.max(max, high - low);
        }

        return max;
    }
}