//level order traversal;

//count of nodes

import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class binaryTrees_05 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTrees(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTrees(nodes);
            newNode.right = buildTrees(nodes);

            return newNode;
        }
    }

    // levelorder
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    //time complexity o(n);
    //count of nodes
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;

    }

    //sum of nodes
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, };
        BinaryTrees trees = new BinaryTrees();
        Node root = trees.buildTrees(nodes);

        System.out.println("level order:");
        levelOrder(root);

        System.out.println("\ncount of nodes:");
        System.out.println(countOfNodes(root));

        System.out.println("\nsum of nodes");
        System.out.println(sumOfNodes(root));
    }
}
