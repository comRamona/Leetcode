/**
 * Created by rama on 27/12/15.
 */
public class LongestCommonPrefix {
    /**
     * ghdsaba
     * ghdsklaas
     * ghma
     */

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        int minL = strs[0].length();
        int minI = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0 || strs[i] == null) return "";
            if (strs[i].length() < minL) {
                minL = strs[i].length();
                minI = i;
            }
        }
        String ref = strs[minI];
        int i = 0;
        while (i < minL) {

            for (String s : strs) {
                if (s.charAt(i) != ref.charAt(i)) {
                    return ref.substring(0, i);
                }
            }
            i++;
        }
        return ref;

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"alb", "alabama", "albert"}
        ));
    }
}