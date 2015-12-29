import java.util.HashMap;
import java.util.Map;

/**
 * Created by rama on 29/12/15.
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order
 * of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * <p>
 * Given "foo", "bar", return false.
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            Character c3 = map.get(c1);
            if (c3 == null) {
                if (map.containsValue(c2))
                    return false;
                map.put(c1, c2);
            } else {
                if (!c2.equals(c3))
                    return false;
            }
        }
        return true;
    }
}
