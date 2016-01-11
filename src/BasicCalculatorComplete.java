import java.util.Stack;

/**
Basic calculator to perfom +,-,*,/ keeping in mind precedence and also (, )
*/
public class BasicCalculatorComplete {
    public static void main(String[] args0) {
        BasicCalculatorComplete b = new BasicCalculatorComplete();
        System.out.println(b.calculate("3+(1*2+4)*2-1"));

    }

    /*
    Returns true if op2 has higher or equal precedence compared to op1
    */
    public boolean hasPrecedence(char op1, char op2){
    if (op2 == '(' || op2 == ')')
        return false;
        return !((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'));
    }

     public int calculate(String s) {

        Stack<Integer> nr=new Stack<Integer>();
        Stack<Character> ch=new Stack<Character>();
        for(int i=0;i<s.length();i++){
        Character c=s.charAt(i);
        if(c.equals(' ')) continue;
        else if(Character.isDigit(c)){
            int val=c-'0';
            while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                val=val*10+s.charAt(i+1)-'0';
                i++;
            }
            nr.push(val);
        }
        else if(c.equals('(')){
            ch.push(c);
        }
        else if(c.equals(')')){
            while(!ch.isEmpty()){
                Character x=ch.pop();
                if(x.equals('(')) break;

                else if(x.equals('+')){
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=b+a;
                    nr.push(d);
                }
                 else if(x.equals('-')){
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=b-a;
                    nr.push(d);
                } else if (x.equals('*')) {
                    int a = nr.pop();
                    int b = nr.pop();
                    int d = b * a;
                    nr.push(d);
                } else if (x.equals('/')) {
                    int a = nr.pop();
                    int b = nr.pop();
                    int d = b / a;
                    nr.push(d);
                }

            }
        }
        else if(c.equals('+')||c.equals('-')||c.equals('/')||c.equals('*')){

            while(!ch.isEmpty()&&hasPrecedence(c,ch.peek())){
                    char r=ch.pop();
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=0;
                if (r == '+') d = b + a;
                    else if(r=='*') d=b*a;
                    else if(r=='-') d=b-a;
                    else if(r=='/') d=b/a;
                    nr.push(d);
            }
              ch.push(c);

        }


        }
        while(!ch.isEmpty()){
            char op=ch.pop();
            if(op=='+'){
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=b+a;
                    nr.push(d);
            }
            else if(op=='-'){
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=b-a;
                    nr.push(d);
            }
            else if(op=='*'){
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=b*a;
                    nr.push(d);
            }
            else if(op=='/'){
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=b/a;
                    nr.push(d);
            }
        }

         return nr.pop();
    }
}
