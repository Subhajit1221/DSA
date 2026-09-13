class Solution {
    public int firstUniqChar(String s) {

        int freq[]= new int[256];
       

        int i=s.length()-1;

        while(i>=0){
            freq[s.charAt(i)]++;

            

            i--;
        }

        i=0;


        while(i<s.length()){
            if(freq[s.charAt(i)]==1){
                return i;
            }
            i++;
        }

        return -1;
        
    }
}