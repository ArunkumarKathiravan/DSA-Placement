package dsa.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static boolean isValid(String text) {
        Deque<Character> expected = new ArrayDeque<>();
        for (char character : text.toCharArray()) {
            if (character == '(') {
                expected.push(')');
            } else if (character == '[') {
                expected.push(']');
            } else if (character == '{') {
                expected.push('}');
            } else if (expected.isEmpty() || expected.pop() != character) {
                return false;
            }
        }
        return expected.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}
