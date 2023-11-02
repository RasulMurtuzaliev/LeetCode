package Easy;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            System.out.println("Before: " + stack);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.empty() || stack.pop() != ch) {
                return false;
            }
            System.out.println(stack);
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Valid_Parentheses_20 valid_Parentheses_20 = new Valid_Parentheses_20();
        System.out.println(valid_Parentheses_20.isValid("([])[]{}"));
    }
}
