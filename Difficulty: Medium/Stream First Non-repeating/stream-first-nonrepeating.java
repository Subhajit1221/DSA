class Solution {
    public String firstNonRepeating(String s) {
        
        Queue <Character> q= new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        int f[]= new int[26];
        
        for(int i=0;i<s.length();i++){
            
             q.add(s.charAt(i));
             f[s.charAt(i)%97]++;
                
                if(f[s.charAt(i)%97]>1){
                    
                    
                    
                    while(!q.isEmpty() && f[q.peek()%97]>1 ){
                        q.remove();
                    }
                    
                    if(q.isEmpty()){
                        sb.append('#');
                    }else{
                        sb.append(q.peek());
                    }
                }else{
                    sb.append(q.peek());
                }
                
                
            
        }
        
        return sb.toString();
        
    }
}