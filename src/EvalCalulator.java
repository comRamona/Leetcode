import java.util.Stack;

/**
 * Created by rama on 31/12/15.
 */

public class EvalCalulator {
    public static int calculate(String s) {
        s = "(" + s + ")";
        Stack<Character> chars = new Stack<Character>();
        Stack<Integer> nums = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
            if (c == '(' || c == '+' || c == '-') chars.push(c);
            else if (c == ' ') continue;
            else if (c == ')') {
                char ch = chars.pop();
                Stack<Character> chars2 = new Stack<Character>();
                Stack<Integer> nums2 = new Stack<Integer>();
                while (ch != '(') {
                    int a = nums.pop();
                    int b = nums.pop();
                    nums2.push(a);
                    nums2.push(b);
                    chars2.push(ch);
                    ch = chars.pop();
                }
                while (!chars2.isEmpty()) {
                    int a = nums2.pop();
                    int b = nums2.pop();
                    char cha = chars2.pop();
                    int d;
                    if (cha == '+') {
                        System.out.println("plus " + a + " " + b);
                        d = a + b;
                        nums.push(d);
                        System.out.println(d);
                    } else {
                        System.out.println("min" + a + " " + b);
                        d = b - a;
                        nums.push(d);
                        System.out.println(d);

                    }
                }
                nums.push(nums2.pop());
            } else {
                String nr = "";
                while (i < s.length() && c <= '9' && c >= '0') {
                    c = s.charAt(i);
                    nr += c;
                    i++;
                }
                i -= 2;
                System.out.println(c);
                nr = nr.substring(0, nr.length() - 1);
                int n = Integer.parseInt(nr);
                System.out.println("nums " + n);
                nums.push(n);

            }
        }
        int q = nums.pop();
        return q;
    }

    public static void main(String[] args) {
        int a = calculate("5+5-2-3");
        System.out.println(a);
    }
}
