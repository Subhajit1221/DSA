class Solution {
    public int findLongestChain(int[][] pairs) {
        
        int size = pairs.length;
         

   Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

   

    System.out.println(Arrays.deepToString(pairs));

            int b=pairs[0][1];
            int count=1;
            

           for(int i=1;i<size;i++){
            int c=pairs[i][0];

            if(b<c){
                
                b=pairs[i][1];
                count++;
            }
           }

           return count;
    }
}