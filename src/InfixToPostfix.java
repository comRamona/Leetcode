import java.io.IOException;
import java.util.Stack;

/**
 * Created by rama on 11/01/16.
 * <p>
 * Values: Immediately output
 * Close parenthesis: Pop stack symbols until we see a symbol of lower precedence
 * Operator: Pop all stack symbols until wee see a symbol of lower precedence. Then push the operatr
 * -Opening paranthsis can be considered high precedence when is read, but on the stack it has the lowest precedence, so we simply directly push it
 */
public class InfixToPostfix {
    private Stack<Character> stack;
    private String input;
    private String output = "";

    public InfixToPostfix(String in) {
        input = in;
        stack = new Stack<Character>();
    }

    public static void main(String[] args)
            throws IOException {
        String input = "1-2*3*4-(4+5*6)*7";
        String output;
        InfixToPostfix theTrans = new InfixToPostfix(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    String s = "" + ch;
                    while (j + 1 < input.length() && Character.isDigit(input.charAt(j + 1))) {
                        s = s + input.charAt(j + 1);
                        j++;
                    }
                    output = output + s + " ";
                    break;
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }
        System.out.println(output);
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!stack.isEmpty()) {
            char opTop = stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    stack.push(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }
        stack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!stack.isEmpty()) {
            char chx = stack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }
}