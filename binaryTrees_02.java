// perorder traversal

import org.w3c.dom.Node;

public class binaryTrees_02 {
    static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTrees{
        static int idx = -1;
        public static Node buildTrees(int nodes[]){
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
    //time complexity big 0(n);
    public static void perorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        perorder(root.left);
        perorder(root.right);

    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTrees trees = new BinaryTrees();
        Node root = trees.buildTrees(nodes);
        perorder(root);
    }
}
