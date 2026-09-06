class Solution {
    public int pivotIndex(int[] nums) {

        int n=nums.length;

        int prefixsum[]=new int[n];

        int suffixsum[]= new int [n];

        prefixsum[0]=0;
        suffixsum[n-1]=0;

        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i-1];

        }

         for(int i=n-2;i>=0;i--){
            suffixsum[i]=suffixsum[i+1]+nums[i+1];
            
        }
        int i=0;

        while(i<n){
            if(prefixsum[i]==suffixsum[i]){
                return i;
            }

            i++;
        }

        return -1;
        
    }
}