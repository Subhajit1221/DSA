class Solution {
    
    
    public static int lower=0;
    
    public static int find(int arr[],int x, int i, int j){

        if(i>j){
            return lower;
        }




        int mid=(i+j)/2;

        if(arr[mid]>=x){
            lower=Math.min(lower,mid);
            return find(arr,x,i,mid-1);
        }

        

        return find(arr,x,mid+1,j);


    }
    int lowerBound(int[] arr, int target) {
        
        lower=arr.length;
        
        
        return find(arr,target,0,lower-1);
        
        
    }
}
