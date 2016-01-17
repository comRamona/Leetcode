/**
 * Created by rama on 17/01/16.
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * <p>
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level
 * revision of the second first-level revision.
 * <p>
 * Here is an example of version numbers ordering:
 * <p>
 * 0.1 < 1.0=1<1.1 < 1.2 < 13.37.29.01
 */
public class CompareVersion {
    public static void main(String[] args) {
        String s = "01";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int min = Math.min(v1.length, v2.length);
        for (int i = 0; i < min; i++) {
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[i]);
            if (a < b) return -1;
            if (a > b) return 1;
        }
        if (v1.length == v2.length) return 0;
        for (int i = min; i < v1.length; i++) {
            if (Integer.parseInt(v1[i]) != 0) return 1;
        }
        for (int i = min; i < v2.length; i++) {
            if (Integer.parseInt(v2[i]) != 0) return -1;
        }
        return 0;
    }
}
