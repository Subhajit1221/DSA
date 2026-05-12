import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int size = tasks.length;
        int count = 0;

        Integer freq[] = new Integer[26];

        // initialize with 0
        for(int i = 0; i < 26; i++){
            freq[i] = 0;
        }

        // frequency count
        for(int i = 0; i < size; i++){

            if(freq[tasks[i] - 'A'] == 0){
                count++;
            }

            freq[tasks[i] - 'A']++;
        }

        // sort in decreasing order
        Arrays.sort(freq, Collections.reverseOrder());

        // create empty slots
        int slot = (freq[0] - 1) * n;

        // fill slots using remaining tasks
        for(int i = 1; i < count; i++){

            slot = slot - Math.min(freq[i], freq[0] - 1);
        }

        // if all slots filled
        if(slot <= 0){
            return size;
        }

        // remaining slots are idle intervals
        return size + slot;
    }
}