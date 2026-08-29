class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int size=nums.length;

        int min = Integer.MAX_VALUE;
        int def=0;
        int minsum=0;
        int low=0;
        int high=size-1;

        for(int i=0;i<size-2;i++){
            low=i+1;
            high=size-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                
                if(sum==target){
                    return sum;
                } else if(sum>target){
                    high--;
                }else{
                    low++;
                }
                def=sum-target;

                if(def<0){
                    def=def*(-1);
                }

                if(def<min){
                    min=def;
                    minsum=sum;
                }


                
            }
        }

        return minsum;
        
    }
}