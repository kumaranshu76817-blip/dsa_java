//ITERATIVE METHOD OF REVERSE THE LINKEDLIST
public class linkedlist_04_ {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
        Node head;
        //reverese iterative
        public void reverseIterative(){
            Node prev = null;
            Node curr = head;
            Node next = null;
            while(curr != null){
                next = curr.next; //store next node
                curr.next = prev; // reverese link
                prev = curr; // move prev forward
                curr = next;// move next forward

            }
            head = prev;
        }
        

        //reverese usirng recursion
        public Node revereseRecursion(Node head){
            //base case
            if(head == null || head.next == null){
                return head;
            }
            Node newHead = revereseRecursion(head.next);
            head.next.next = head;
            head.next = null;  // reverese link
            return newHead;
        }
        public  void printList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    
    public static void main(String[] args){
        linkedlist_04_ list = new linkedlist_04_();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);


        System.out.println("original");
        list.printList();

        
        list.reverseIterative();

        System.out.println("reversed :");
        list.printList();

        list.revereseRecursion(null);
        System.out.println("reversed using recursion :");
        list.printList();
    }
    
}