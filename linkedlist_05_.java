public class linkedlist_05_ {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public Node reverseKGroup(Node head, int k){
        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;
        while (curr != null && count<k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        // recursive call for next group
        if(next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev; // new head
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NUll");
    }
    public static void main(String[] args) {
        linkedlist_05_ list = new linkedlist_05_();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("orginal ");
        list.printList();

        int k = 2;
        list.head = list.reverseKGroup(list.head, k);

        System.out.println("reverse in group:");
        list.printList();
    }
}
