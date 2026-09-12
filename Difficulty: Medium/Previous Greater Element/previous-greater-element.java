class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        
        ArrayList<Integer> res= new ArrayList<>();
        Stack <Integer> s= new Stack<>();
        
        for(int i=0; i<arr.length;i++ ){
            
            while(!s.isEmpty() && arr[i]>=s.peek()){
                    s.pop();
                }
            
            if(s.isEmpty()){
                res.add(-1);
                s.push(arr[i]);
                
            }else {
                res.add(s.peek());
                s.push(arr[i]);
            }
        }
        
        return res;
        
    }
}