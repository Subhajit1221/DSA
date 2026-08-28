class Solution {
    public boolean check(int[] nums) {

        int size=nums.length;

        int flag=0;

        int i=0;
        int n=0;

        while(n<size){
            if(nums[i]>nums[(1+i)%size]){
                flag++;
            }

           i=(i+1)%size;

           if(flag>1){
            return false;
           }

           n++;
        }

        

        

        return true;
    }
}