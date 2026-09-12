class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> st = new Stack<>();

       

        int i=1;

        st.push(new int[]{s.charAt(0),1});


        while(i< s.length()){

            char c=s.charAt(i);

            

            if(!st.isEmpty() && st.peek()[0]==c){
            st.peek()[1]++;
           }else{
                  st.push(new int[]{c,1});
           }

            if( st.peek()[1]==k){
                
                    st.pop();
                
            }
             
           



           
            i++;


        }

         StringBuilder ans=new StringBuilder("");

       for (int[] pair : st) { 
        for (int j = 0; j < pair[1]; j++) {
    ans.append((char) pair[0]);
}
             
             }
             
              return ans.toString(); 
       } 
       }