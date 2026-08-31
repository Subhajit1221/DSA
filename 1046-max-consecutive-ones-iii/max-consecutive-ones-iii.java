class Solution {
    public int longestOnes(int[] nums, int k) {

        int low=0;
        int high=0;
        int max=Integer.MIN_VALUE;
        int binary[]= new int[2];
        int maxFrequency=0;

        while(high<nums.length){
            binary[nums[high]]++;

            maxFrequency=binary[1];

            while(high-low+1-maxFrequency>k){
                binary[nums[low]]--;
                low++;
            } 


            max=Math.max(max,high-low+1);

            high++;
        }

        return max;
        
    }
}