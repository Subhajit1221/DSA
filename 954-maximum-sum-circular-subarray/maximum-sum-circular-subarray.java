class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        
        int maxEnding=nums[0];
        int minEnding=nums[0];
        int min=nums[0];
        int max=nums[0];

        int n=nums.length;
        
        int sum=nums[0];

        for(int i=1;i<n;i++){
            sum+=nums[i];

            maxEnding=Math.max(maxEnding+nums[i],nums[i]);

            minEnding=Math.min(minEnding+nums[i],nums[i]);

            min=Math.min(minEnding,min);
            max=Math.max(maxEnding,max);

            
            
        }

        if (max < 0) {
    return max;
          }

        return Math.max(sum-min,max);
        
    }
}