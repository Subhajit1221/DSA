class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         
         int low=0;
         int high=0;

         int min=Integer.MAX_VALUE;
         int sum=0;
         int curr=0;
         int size=nums.length;

         while(high<size){
            sum+=nums[high];
                high++;

            while(sum>=target){
                
                 curr=high-low;
                 min=Math.min(curr,min);
                 sum-=nums[low];
                 low++;
                 
            

            }

         }

         return min == Integer.MAX_VALUE ? 0 : min;
    }
}