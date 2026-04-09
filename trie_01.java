public class trie_01 {
    static class Node{
        Node [] children;
        boolean endOfWord;
        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static Node root = new Node();

    //insert in trie
    public static void insert(String word){  //time complexity of O(l)
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[i] == null){
                curr.children[idx] = new Node();
                
            }

            if(i == word.length() - 1){
                curr.children[idx].endOfWord = true;
            }
            curr =curr.children[idx];
        }
    }

    public static boolean search(String key){  // time complexity of O(L) where L = key.length;
        Node curr = root; 
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length() - 1 &&  node.endOfWord == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;

    }
    public static void main(String[] args) {
        String word [] = {"the","a","there","their" , "any"};
        for(int i= 0; i<word.length; i++){
            insert(word[i]);
        }
        System.out.println(search("their")); //true
        System.out.println(search("an"));    //false
        System.out.println(search("thor"));  //false

        
    }
}
