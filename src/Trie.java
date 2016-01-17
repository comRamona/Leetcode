import java.util.HashMap;
import java.util.Map;

/**
 * Created by rama on 17/01/16.
 * Implement a trie with insert, search, and startsWith methods.
 */
class TrieNode {
    // Initialize your data structure here.
    public Map<Character, TrieNode> children = null;
    public boolean isLeaf = false;
    public char val;

    public TrieNode() {

    }

    public TrieNode(char val) {
        this.val = val;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("ab");
        trie.insert("abcd");
        trie.insert("an");
        System.out.println(trie.startsWith("ab"));
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.children == null) {
                node.children = new HashMap<Character, TrieNode>();
            }
            if (!node.children.containsKey(ch)) {
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.isLeaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.children == null || !node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return node.isLeaf;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (node.children == null || !node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");