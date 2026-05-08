class Solution {
    public boolean isValid(String s) {



        Stack <Character> stack=new Stack<>();

        int n=s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
               if(stack.isEmpty()){
                return false;
               }else if(s.charAt(i)==')'&& stack.peek()=='('){
                stack.pop();
               }else if(s.charAt(i)=='}'&& stack.peek()=='{'){
                stack.pop();
               }else if(s.charAt(i)==']'&& stack.peek()=='['){
                stack.pop();
               }else{
                  return false;
               }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
        
    }
}