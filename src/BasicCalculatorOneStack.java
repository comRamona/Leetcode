/**
 * Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
*/
public class BasicCalculatorOneStack {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<Integer>();
        int res=0,val=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c.equals('(')){
                st.push(sign);
            }
            else if(c.equals(')')){
                st.pop();
            }
            else if(c.equals('+')||c.equals('-')){
                res+=sign*val;
                val=0;
                if(!st.isEmpty()){
                    if(c.equals('-')){
                        sign=st.peek()*(-1);
                    }
                    else
                    {
                        sign=st.peek();
                    }
                    
                }
                    
                else {
                        if(c.equals('-'))
                        sign=-1;
                        else
                        sign=1;
                    
                 }
            }
            else if(!c.equals(' ')){
                val=val*10+(c-'0');
            }
        }
        res+=val*sign;
        return res;
    }
}
