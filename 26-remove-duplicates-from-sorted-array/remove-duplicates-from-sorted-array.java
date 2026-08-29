class Solution {
    public int removeDuplicates(int[] nums) {

        int i=1;
        int j=0;

        int size=nums.length;
        
        while(i<size){



            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];

            }

            i++;

        }

       

        return j+1;
        
    }
}