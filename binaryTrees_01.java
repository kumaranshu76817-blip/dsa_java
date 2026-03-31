public class binaryTrees_01 {
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
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTrees trees = new BinaryTrees();
        Node root = trees.buildTrees(nodes);
        System.out.println(root.data);
    }
}
