class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> s = new ArrayDeque<>();

        for(String token : tokens) {

            switch(token) {

                case "+":
                    s.push(s.pop() + s.pop());
                    break;

                case "-":
                    int b1 = s.pop();
                    int a1 = s.pop();
                    s.push(a1 - b1);
                    break;

                case "*":
                    s.push(s.pop() * s.pop());
                    break;

                case "/":
                    int b2 = s.pop();
                    int a2 = s.pop();
                    s.push(a2 / b2);
                    break;

                default:
                    s.push(Integer.parseInt(token));
            }
        }

        return s.pop();
    }
}