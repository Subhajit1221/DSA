class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int n=nums.length;
                
        
        int max = Math.abs(nums[0]);
        

        int bestEnding=nums[0];
        int minEnding=nums[0];

        for(int i=1;i<n;i++){
            

            minEnding=Math.min(minEnding+nums[i],nums[i]);

            bestEnding=Math.max(bestEnding+nums[i],nums[i]);
            max=Math.max(Math.max(max,-minEnding),bestEnding);
            
            
        }

        return max;
    }
}