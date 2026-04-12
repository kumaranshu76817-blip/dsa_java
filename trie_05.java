//longest word in all prefix

import org.w3c.dom.Node;

public class trie_05 {
    static class Node{
        Node [] children = new Node[26];
        boolean endOfWord = false;

    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            if(i == word.length() - 1 ){
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].endOfWord == true){
                temp.append((char)(i + 'a'));

                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String word []= {"a", "apple","app","appl","ap","banana","apply"};
        
        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }

        longestWord(root, new StringBuilder(""));

        System.out.println(ans);
    }
}
