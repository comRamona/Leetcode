import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rama on 20/01/16.
 */
public class MyDialPad {
    static final HashMap<Character, String> map = new HashMap<Character, String>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public static void main(String[] args) {
        MyDialPad dp = new MyDialPad();
        System.out.println(dp.decode("262"));
    }

    public List<String> decode(String num) {
        List<String> res = new ArrayList<String>();
        List<String> preres = new ArrayList<String>();
        res.add("");
        for (int i = 0; i < num.length(); i++) {
            String s = map.get(num.charAt(i));
            for (String r : res) {
                for (int j = 0; j < s.length(); j++) {
                    preres.add(r + s.charAt(j));
                }
            }
            res = preres;
            preres = new ArrayList<>();
        }
        return res;
    }
}
