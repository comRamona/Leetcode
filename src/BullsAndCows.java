import java.util.HashMap;
import java.util.Map;

/**
 * Created by rama on 05/01/16.
 */
public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        int temp = 0;
        int bulls = 0;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                nums1[s - '0']++;
                nums2[g - '0']++;
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; i++) {
            cows += Math.min(nums1[i], nums2[i]);
        }
        String res = bulls + "A" + cows + "B";
        return res;
    }

    public static String getHintCloseEnough(String secret, String guess) {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++)
            map.put(i, secret.charAt(i));

        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (map.containsKey(i))
                if (map.get(i) == c) {
                    map.replace(i, '#');
                    bulls++;
                }
        }
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            for (Integer key : map.keySet()) {

                if (map.get(key) == c) {
                    map.replace(key, '#');
                    cows++;
                    break;
                }
            }
        }


        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("011", "110"));
    }
}
