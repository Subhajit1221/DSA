class Solution {
    public int findMinSum(int[] a, int[] b) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int size=a.length;
        int s=0;
        
        for(int i=0;i<size;i++){
             int curr=a[i]-b[i];
             
             if(curr<0){
                curr= curr*-1;
             }
             
             s+=curr;
             
        }
        
        return s;
    }
};