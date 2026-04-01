// mirror of binary tree;

import org.w3c.dom.Node;

public class binaryTrees_08 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static void mirror(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recurison of left or right subtree:
        mirror(root.left);
        mirror(root.right);

    }

    // inorder traversal to check result:
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Original Tree (Inorder): ");
        inorder(root);

        mirror(root);

        System.out.print("\nMirror Tree (Inorder): ");
        inorder(root);
    }
}
