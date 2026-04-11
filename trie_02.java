// word break problem 

public class trie_02 {
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[idx].endOfWord = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }

            if (i == key.length() - 1 && !node.endOfWord) {
                return false;
            }

            curr = node;
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);

            if (search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] word = {"i", "like", "samsung", "mobile"};
        String key = "likesamsung";

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        System.out.println(wordBreak(key)); // true
    }
}