import java.util.Stack;

/**
 * Created by rama on 17/01/16.
 */
public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                char c2 = stack.pop();
                if (!match(c, c2)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public boolean match(char c, char c2) {
        return (c == ')' && c2 == '(') || (c == ']' && c2 == '[') || (c == '}' && c2 == '{');
    }
}
