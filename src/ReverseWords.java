/**
 * Reverse the letter from the words in a string
 *
 * @author rama
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != ' ')
                word.append(c);
            else {
                if (!word.toString().equals("")) {
                    //System.out.print(word);
                    StringBuilder reverse = word.reverse();
                    sb.append(reverse);
                    sb.append(c);
                }
                word = new StringBuilder();
            }

        }
        StringBuilder reverse = word.reverse();
        sb.append(reverse);
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("     I am a beautiful cat ") + "y");
    }
}
   