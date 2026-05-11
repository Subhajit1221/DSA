class MyStack {

 Queue<Integer> q;


    public MyStack() {
 

     q=new LinkedList<>();
    
       
        
    }

     public void push(int x) {
       
       Queue<Integer> q1 = new LinkedList<>();
        while(!q.isEmpty()){
            q1.add(q.remove());
        }

        q.add(x);

        while(!q1.isEmpty()){
            q.add(q1.remove());
        }
        
        
     }
    
    
    
    public int pop() {

        return q.remove();
        
    }
    
    public int top() {

        return q.peek();
        
    }
    
    public boolean empty() {

        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */