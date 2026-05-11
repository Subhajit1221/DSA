class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        
        double ratio[][]= new double[val.length][3];
        
        for(int i=0;i<val.length; i++){
            
            ratio[i][0]=val[i]*1.0/wt[i];
            ratio[i][1]=val[i];
            ratio[i][2]=wt[i];
            
        }
        
        double profit=0;
        
         Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));
         
         for(int i=0;i<val.length;i++){
             
             if(ratio[i][2]<=capacity){
                 
                 profit+= ratio[i][1];
                 capacity-=ratio[i][2];
             }else if(capacity>0){
                 
                 profit+=ratio[i][0]*capacity;
                 capacity=0;
             }
             
         }
         
         return profit;
    }
}