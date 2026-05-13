class Solution {
    public int findMin(int n) {
        
        int count=0;
        
        while(n!=0 ){
             if(n>=10){
                 count+=n/10;
                 n=n%10;
             }else if(n>=5){
                 count+=n/5;
                 n=n%5;
             }else if(n>=2){
                 count+=n/2;
                 n=n%2;
             }else {
                 count+=n;
                 n=0;
             }
        }
        
        return count;
        
    }
}
