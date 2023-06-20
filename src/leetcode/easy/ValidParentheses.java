package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        var charArray = s.toCharArray();

        if (charArray.length % 2 != 0) {
            return false;
        }

        var stack = new Stack<Character>();
        for (var character : charArray) {
            if (character == '[' || character == '{' || character == '(') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (character == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (character == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (character == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
