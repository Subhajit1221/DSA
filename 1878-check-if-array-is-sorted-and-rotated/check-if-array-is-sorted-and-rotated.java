class Solution {
    public boolean check(int[] nums) {

        int size=nums.length;

        int flag=0;

        int i=0;

        while(i<size-1 && flag<1){
            if(nums[i]>nums[i+1]){
                flag++;
            }

            i++;
        }

        System.out.print(i);

        if(flag==0){
            return true;
        }
        
        int n=1;
        int x=i;
        while(n<size){
           if(nums[x]>nums[(1+x)%size]){
                return false;
            }
            x=(x+1)%size;
            n++;
        }

        return true;
    }
}