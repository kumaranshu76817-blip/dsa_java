//inorder traversal

import org.w3c.dom.Node;

public class binaryTrees_03 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTrees{
        static int idx = -1;
        public static Node buildTrees(int nodes []){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTrees(nodes);
            newNode.right = buildTrees(nodes);

            return newNode;
        }
    }

    //inorder traversal;
    public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTrees trees = new BinaryTrees();
        Node root = trees.buildTrees(nodes);
        inorder(root);
    }
}
