import org.w3c.dom.Node;

public class binarySearchTrees_03 {
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
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    //inorder 
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //delete a node;
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{ //root.data = val;

            //case 1:
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2:
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3:
            Node is = inordersuccesior(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data); 

        }
        return root;
    }
    public static Node inordersuccesior(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 4);
        inorder(root);
        System.out.println();

        delete(root, 11);
        inorder(root);
    }
}
