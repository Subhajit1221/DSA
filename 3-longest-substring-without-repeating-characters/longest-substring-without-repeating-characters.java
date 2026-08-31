class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;
        int max = 0;

        while (high < s.length()) {

            char ch = s.charAt(high);

            if (map.containsKey(ch)) {
                low = Math.max(low, map.get(ch) + 1);
            }

            map.put(ch, high);

            max = Math.max(max, high - low + 1);

            high++;
        }

        return max;
    }
}