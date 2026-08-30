class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int low=1;
        int high=k;
        int sum=0;
        
        int size=arr.length;
        
        
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int max=sum;
        while(high<size){
            
            sum=sum-arr[low-1]+arr[high];
            
            max=Math.max(sum,max);
            low++;
            high++;
            
        }
        
        return max;
        
    }
}