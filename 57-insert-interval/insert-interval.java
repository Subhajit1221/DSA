class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        

        int arr[][]=new int[intervals.length+1][2];

        int j=0;
        int flag=0;

        

        for(int i=0;i<intervals.length+1;i++){

            if(j< intervals.length && intervals[j][0]<newInterval[0] ){

            

            arr[i][0]=intervals[j][0];
            arr[i][1]=intervals[j][1];
            j++;
        }else if(flag==0){
            
            arr[i][0]=newInterval[0];
            arr[i][1]=newInterval[1];
            flag=1;
        }else{
            arr[i][0]=intervals[j][0];
            arr[i][1]=intervals[j][1];
            j++;
        }

        }

        ArrayList<int[]> list = new ArrayList<>();

        int i=0;

        while(i<arr.length){
            int start= arr[i][0];

            int end= arr[i][1];

            while(i< arr.length-1 && end>=arr[i+1][0]){

                end=Math.max(end,arr[i+1][1]);
                i++;
            }

            list.add(new int []{start,end});
            i++;
        }
        

        return list.toArray(new int[list.size()][]);
    }
}