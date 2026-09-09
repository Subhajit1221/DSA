class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        

        int m=firstList.length;
        int n=secondList.length;
        if(m==0 || n==0){
            return new int[0][0];
        }

        int start1=firstList[0][0];

        int end1= firstList[0][1];

        int start2=secondList[0][0];

        int end2= secondList[0][1];

        int i=0;
        int j=0;

        ArrayList<int[]> list = new ArrayList<>();

        while(i<m && j<n){

           if(start1<=start2){

            if(end1>=start2){
                list.add(new int[]{Math.max(start1,start2),Math.min(end1,end2)});
            }
           }else{

            if(end2>=start1){
                list.add(new int[]{Math.max(start1,start2),Math.min(end1,end2)});
            }

           }

            if(end1<=end2){
                i++;

                if(i<m){
                   end1=firstList[i][1];
                  start1=firstList[i][0];
                  
                }
                


            }else{
                   j++;
                   if(j<n){
                    start2=secondList[j][0];

                    end2= secondList[j][1];

                   }
                
            }
            
        }

        

        return list.toArray(new int[list.size()][]);
        
    }
}