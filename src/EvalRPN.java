import java.util.Arrays;
import java.util.Stack;

/**
 * Created by rama on 31/12/15.
 */
public class EvalRPN {
    public static void main(String[] args) {
        String s = "2+ 3 -   3 /25";
        String[] t = s.split(" ");
        System.out.println(Arrays.toString(t));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String s : tokens) {
            if (s.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = a + b;
                stack.push(c);
            } else if (s.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = a * b;
                stack.push(c);
            } else if (s.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = b / a;
                stack.push(c);
            } else if (s.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = b - a;
                stack.push(c);
            } else {
                int n = Integer.parseInt(s);
                stack.push(n);
            }
        }
        int res = stack.pop();
        return res;

    }
}
