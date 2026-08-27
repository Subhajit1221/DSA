class Solution {
    
    
    
    static int upper =-1;
    public static int find(int arr[],int x, int i, int j){
        
        if(arr[0]>x){
            return -1;
        }
        
        if(i>j){
            return upper;
        }
        
        
        
        
        int mid=(i+j)/2;
        
        if(arr[mid]<=x){
            upper=Math.max(upper,mid);
            return find(arr,x,mid+1,j);
        }
        
        
        
        return find(arr,x,i,mid-1);
        
        
        
        
        
    }
    
    
    
    static int findFloor(int[] arr, int x) {
        
        int size=arr.length;
        upper = -1; 
        
        
        return find(arr,x,0,size-1);
        
        
        
       
        
    }
}
