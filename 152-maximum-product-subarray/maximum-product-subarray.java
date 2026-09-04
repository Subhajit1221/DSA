class Solution {
    public int maxProduct(int[] nums) {

        int min=nums[0];
        int max=nums[0];
        int n=nums.length;

        int bestending=nums[0];

        for(int i=1;i<n;i++){
            int v1=bestending*nums[i];
            int v2=nums[i];
            int v3=min*nums[i];

            min=Math.min(Math.min(v1,v2),v3);

            bestending=Math.max(v1,Math.max(v2,v3));
            max=Math.max(max,bestending);
            
            
        }

        return max;
        
    }
}