public class linkedlist_07_ {

    static class Node {   // make static
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void removeLoop() {
        Node slow = head;
        Node fast = head;
        boolean loopexist = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopexist = true;
                break;
            }
        }

        // no loop
        if (!loopexist) return;

        // find starting point
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // find last node of loop
        Node temp = fast;
        while (temp.next != slow) {
            temp = temp.next;
        }

        // break loop
        temp.next = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedlist_07_ list = new linkedlist_07_();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // create loop
        list.head.next.next.next.next = list.head.next;

        list.removeLoop();

        //  print after removing loop
        list.printList();
    }
}