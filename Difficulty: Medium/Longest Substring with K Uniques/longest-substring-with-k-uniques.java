class Solution {
    public int longestKSubstr(String s, int k) {
       
       HashMap<Character, Integer> count = new HashMap<>();
       int low=0;
       int high=0;
       int max=Integer.MIN_VALUE;
       
       while(high<s.length()){
           if (count.containsKey(s.charAt(high))) {
               
               count.put(s.charAt(high), count.get(s.charAt(high)) + 1);
           } else {
               
               count.put(s.charAt(high), 1);
           }
           
           high++;
           
           if(count.size()==k){
               max=Math.max(max,high-low);
           }
           
           while(count.size()>k){
               
               
            count.put(s.charAt(low), count.get(s.charAt(low)) - 1);
            
            if(count.get(s.charAt(low))<=0){
                count.remove(s.charAt(low));
            }
            
            
           
            low++;
           }
       }
       
       if(max==Integer.MIN_VALUE){
           return -1;
       }
       
       return max;
        
    }
}