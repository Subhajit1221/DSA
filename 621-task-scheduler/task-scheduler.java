class Solution {
    public int leastInterval(char[] tasks, int n) {

        int size=tasks.length;
        int count=0;

        Integer freq []= new Integer[26];
        
        for(int i=0;i<26;i++){
    freq[i]=0;
}
        
        for(int i=0;i<size;i++) {

            if(freq[tasks[i]-'A']==0){
                count++;
            }

            freq[tasks[i]-'A']++;
        }


        


      Arrays.sort(freq, Collections.reverseOrder());

      int interval=0;
      int slot=(freq[0]-1)*n;;


      for(int i=1;i<count;i++){
           
           if(slot<=0){
            return size;
           }else{
           slot = slot - Math.min(freq[i], freq[0]-1);
           }
      }

      if(slot<=0){
            return size;
           }



         interval=size+slot;
         return interval;
    }
}