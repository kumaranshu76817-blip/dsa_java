public class linkedlist_06_ {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public boolean detectloop(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       //move 1 step
            fast = fast.next.next;  //move 2 step

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        linkedlist_06_ list = new linkedlist_06_();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        //creating loop manually
        list.head.next.next.next.next = list.head.next;

        if(list.detectloop()){
            System.out.println("loop detected");
        }
        else{
            System.out.println("not loop");
        }
    }
}
