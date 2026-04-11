import org.w3c.dom.Node;

public class tries_03 {
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
            if(i == word.length() - 1){
                curr.children[idx].endOfWord = true;
            }
             curr = curr.children[idx];
        }
       
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(curr.children[idx] == null){
                return false;
            }
            if(i == key.length() - 1 && !node.endOfWord){
                return false;
            }
           curr = curr.children[idx];
            
        }
        return true;
        
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
        
    }
    public static void main(String[] args) {
        String word []= {"appple", "app", "orange", "with"};
        String prefix = "app";
        for(int i=0; i<word.length; i++){
            insert(word[i]);

        }
        System.out.println(startWith(prefix));
    }
}
