/**
 * Created by rama on 07/01/16.
 *  "Hello  World   " -> 5
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c!=' ') len++;
            if(c==' '&&len!=0) return len;
        }
        return len;
    }
    public static void main(String[] args){
        int x=1534236469;
        x=0-x;
        System.out.println(x);
    }
}
