package LeetCode;

import java.util.Stack;

public class Stack_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
               if (stack.isEmpty()) {
                   return false;
               }
               char top = stack.pop();
               if (c == ')' && top != '(') {
                   return false;
               }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
