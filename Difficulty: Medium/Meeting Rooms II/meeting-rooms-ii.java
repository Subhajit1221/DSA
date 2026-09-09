class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        
        
        if(start.length==0){
            return 0;
        }
        
        
       
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i=0;
        int room=0;
        int j=0;
        int max = 0;
        
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                i++;
                room++;
                max=Math.max(max,room);
            }else{
                j++;
                room--;
            }
        }
        
        
        return max;
        
    }
}
