class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int size=nums.length;
         int count=0;
         int max=0;

         for(int i=0;i<size;i++){
              if(nums[i]!=1){
                max=Math.max(count,max);
                count=0;
              }else{

                 count++;

              }

             
         }

         max=Math.max(count,max);

         return max;
    }
}