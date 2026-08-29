class Solution {
    public int majorityElement(int[] nums) {

        int candidate=nums[0];
        int count=1;

        for(int i:nums){

            
             if(i==candidate){
                count++;
             }else{
                count--;
             }

              if(count==0){
                candidate=i;
                count=1;
             }

            
        }

        return candidate;
    }
}