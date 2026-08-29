class Solution {
    public int singleNumber(int[] nums) {

        int size=nums.length;

        if(size==1){
            return nums[0];
        }
        Arrays.sort(nums);

        int i=0;

        for(i=0;i<size-1;i+=2){
            if(nums[i]!=nums[i+1]){
               break;
            }
        }
        return nums[i];
    }
}