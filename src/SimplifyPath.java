import java.util.ArrayList;


/**
 * Created by rama on 07/01/16.
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p>
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 */
public class SimplifyPath {
    public static String simplify(String path) {
        String[] all = path.split("/");
        ArrayList<String> alls = new ArrayList();
        for (String s : all)
            if (!s.equals(".") && !s.equals(""))
                alls.add(s);
        int i = 0;
        while (i != alls.size() && i >= 0) {
            String str = alls.get(i);
            if (str.equals("..")) {
                alls.remove(i);
                if (i > 0) {
                    alls.remove(i - 1);
                    i--;
                }
            } else
                i++;
        }
        String res = "/" + String.join("/", alls);
        return res;
    }

    public static void main(String[] args) {
        String res = simplify("/home/");
        System.out.println(res);
    }
}
