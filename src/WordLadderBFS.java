import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by rama on 20/01/16.
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
 * <p>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the word list
 * For example,
 * <p>
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 */
public class WordLadderBFS {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();// Visited words

        int length = 1;
        queue.offer(beginWord);
        visited.add(beginWord);
        while (!queue.isEmpty()) {
            int count = queue.size();// Level by level BFS

            for (int k = 0; k < count; k++) {
                char[] chs = queue.poll().toCharArray();

                for (int i = 0; i < chs.length; i++) {// Outer loop should be string
                    for (char ch = 'a'; ch <= 'z'; ch++) {// Inner loop should be 'a' - 'z'
                        char chOld = chs[i];
                        if (chs[i] == ch)
                            continue;

                        chs[i] = ch;
                        String cur = String.valueOf(chs);
                        if (endWord.equals(cur))
                            return length + 1;

                        if (!visited.contains(cur) && wordList.contains(cur)) {
                            queue.offer(cur);
                            visited.add(cur);
                        }
                        chs[i] = chOld;
                    }
                }
            }
            length++; // Next round of longer transformation sequence
        }
        return 0;
    }
}
