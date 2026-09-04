class Solution {
    public int minSubarraySum(int[] arr) {
       
       int n=arr.length;
       int bestending=arr[0];
       int max=arr[0];

       for(int i=1; i<n;i++){

           int v1=bestending + arr[i];
           int v2= arr[i];

           bestending=Math.min(v1,v2);

           max=Math.min(bestending,max);

       }

       return max;
       
    }
}