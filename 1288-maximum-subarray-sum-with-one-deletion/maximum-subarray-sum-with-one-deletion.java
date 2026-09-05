class Solution {
    public int maximumSum(int[] arr) {

      
        int max=arr[0];
        int n=arr.length;

        int nodelete=arr[0];;
        int onedelete= -1000000000;;

        for(int i=1;i<n;i++){
            int v1=nodelete+arr[i];
            int v2=arr[i];
            
            onedelete=Math.max(nodelete,onedelete+arr[i]);
            nodelete=Math.max(v1,v2);

            max = Math.max(max, Math.max(nodelete, onedelete));
            
            
            
        }

        return max;
        
    }
}