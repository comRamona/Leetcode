/**
 * Created by rama on 17/01/16.
 * Backtracking+Trie
 * Design a data structure that supports the following two operations:
 * <p>
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 * <p>
 * For example:
 * <p>
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class WordDictionary {

    private static final int R = 26;
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode current = root;
        for (int i = 0, L = word.length(); i < L; i++) {
            int id = word.charAt(i) - 'a';
            if (current.children[id] == null) {
                current.children[id] = new TrieNode();
                current.children[id].isEnd = false;
            }
            current = current.children[id];
        }
        current.isEnd = true;
    }

    // Returns if the word is in the data structure. A word could
// contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        return search(chars, 0, chars.length, root);
    }

    private boolean search(char[] chars, int start, int L, TrieNode root) {
        if (start >= L) return root.isEnd;
        char ch = chars[start];
        if (ch == '.') {
            for (int i = 0; i < R; i++) {
                if (root.children[i] == null) continue;
                if (search(chars, start + 1, L, root.children[i])) return true;
            }
        } else {
            if (root.children[ch - 'a'] != null)
                if (search(chars, start + 1, L, root.children[ch - 'a'])) return true;
        }
        return false;
    }

    public class TrieNode {
        private static final int R = 26;

        private boolean isEnd;
        private TrieNode[] children;

        public TrieNode() {
            isEnd = true;
            children = new TrieNode[R];
        }
    }
}