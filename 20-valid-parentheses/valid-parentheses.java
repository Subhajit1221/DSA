class Solution {
    public boolean isValid(String s) {

        int size = s.length();

        Stack<Character> stack = new Stack<>();

        int i = 0;

        while (i < size) {

            char a = s.charAt(i);

            if (a == '(' || a == '{' || a == '[') {

                stack.push(a);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                if (a == ')' && stack.peek() == '(') {
                    stack.pop();

                } else if (a == '}' && stack.peek() == '{') {
                    stack.pop();

                } else if (a == ']' && stack.peek() == '[') {
                    stack.pop();

                } else {
                    return false;
                }
            }

            i++;
        }

        return stack.isEmpty();
    }
}