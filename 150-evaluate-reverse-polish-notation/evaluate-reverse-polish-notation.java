class Solution {
    public int evalRPN(String[] tokens) {

        int n=tokens.length;

        Stack<Integer> s= new Stack<>();

        
        for(int i=0;i<n;i++){

            if(!tokens[i].equals("+") &&
               !tokens[i].equals("-") &&
               !tokens[i].equals("*") &&
               !tokens[i].equals("/")) {

                s.push(Integer.parseInt(tokens[i]));

            }else{
                int x=s.pop();
                int y=s.pop();

                 if(tokens[i].equals("+")) {
                    s.push(y + x);

                } else if(tokens[i].equals("-")) {
                    s.push(y - x);

                } else if(tokens[i].equals("*")) {
                    s.push(y * x);

                } else {
                    s.push(y / x);
                }
            }
        }

        
        

        return s.pop();
        
    }
}