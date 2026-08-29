class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int size=nums.length;

        int count =1;
        int val=nums[0];

        for(int i =1;i<size;i++){
            if(nums[i]==nums[i-1]){
                count++;
                 
            }else{
                    if(count>size/2){
                    val=nums[i-1];
                    return val;
                }
                count=1;
                }
        }


        if(count>size/2){
            val=nums[size-1];
            }

        return val;
        
    }
}