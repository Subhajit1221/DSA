import java.util.*;

class Solution {
    public int calculate(String s) {

        Stack<Integer> st = new Stack<>();
        int result = 0;
        int sign = 1; // +1 or -1
        int n = s.length();

        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;

                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;

                result += sign * num;
            }

            else if (c == '+') {
                sign = 1;
            }

            else if (c == '-') {
                sign = -1;
            }

            else if (c == '(') {
                st.push(result);
                st.push(sign);

                result = 0;
                sign = 1;
            }

            else if (c == ')') {
                int prevSign = st.pop();
                int prevResult = st.pop();

                result = prevResult + prevSign * result;
            }
        }

        return result;
    }
}