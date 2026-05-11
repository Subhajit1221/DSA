class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        
        
        Queue <Integer> q1= new LinkedList<>();
         Queue <Integer> q2= new LinkedList<>();
        
        int size=q.size();
        
        if(size<=2){
            return;
        }
        int count=0;
         
         while((size/2)!=count){
             q1.add(q.remove());
             count++;
         }
         
         while(!q.isEmpty()  || !q1.isEmpty()  ){
             q2.add(q1.remove());
             q2.add(q.remove());
             
         }
         
         while(!q2.isEmpty() ){
             q.add(q2.remove());
         }
        
    }
}
