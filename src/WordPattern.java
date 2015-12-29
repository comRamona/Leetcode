import java.util.HashMap;
import java.util.Map;

/**
 * 290.
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter
 * in pattern and a non-empty word in str.
 * <p>
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 *
 * @author rama
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length() || str == null || pattern == null || pattern.length() == 0 || str.length() == 0)
            return false;
        Map<String, Character> map = new HashMap<String, Character>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            Character pat = pattern.charAt(i);
            String word = words[i];
            if (map.get(word) == null) {
                if (map.containsValue(pat))
                    return false;
                map.put(word, pat);

            } else {
                if (!map.get(word).equals(pat))
                    return false;
            }

        }
        return true;
    }
}