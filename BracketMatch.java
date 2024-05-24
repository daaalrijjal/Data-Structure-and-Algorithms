import java.util.*;

public class BracketMatch {

    static boolean isOpenBracket(char bracket) {
        return bracket == '{' || bracket == '(' || bracket == '[';
    }

    static boolean isCloseBracket(char bracket) {
        return bracket == '}' || bracket == ')' || bracket == ']';
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
    public static void main(String args[]) {
        String string = "{{()[]}}";
        char[] characters = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char character : characters) {
            if (isOpenBracket(character)) {
                stack.push(character);
            } else if (isCloseBracket(character)) {
                if (!stack.isEmpty() && isMatchingPair(stack.peek(), character)) {
                    stack.pop();
                } else {
                    System.out.println("Unmatched string");
                    return; 
                }
            }
        }

        // If the stack is empty at the end, all brackets were matched
        if (stack.isEmpty()) {
            System.out.println("Matched string");
        }
    }
}

