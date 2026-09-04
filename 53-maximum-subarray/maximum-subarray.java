class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int bestending=nums[0];
        int max=nums[0];

        for(int i=1; i<n;i++){

            int v1=bestending + nums[i];
            int v2= nums[i];

            bestending=Math.max(v1,v2);

            max=Math.max(bestending,max);

        }

        return max;
        
    }
}