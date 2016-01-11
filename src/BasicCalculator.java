import java.util.Stack;

/**
Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
*/
public class BasicCalculator {
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
                }
            }
        }
        else if(c.equals('+')||c.equals('-')){
          
            while(!ch.isEmpty()&&ch.peek()!='('){
                char r=ch.pop();
                    int a=nr.pop();
                    int b=nr.pop();
                    int d=0;
                    if(r=='+')  d=b+a; else d=b-a;
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
        }
        
     return nr.pop();
    }
}
