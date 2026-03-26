import java.util.LinkedList;

import javax.xml.crypto.NodeSetData;

public class linkedlist_02_ {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }

    }

    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
            
        
    }
    // printlist
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.println("null");
    }
    //DELETE FIRST
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    //delete last 
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast = null;
    }
    public static void main(String[] args) {
        linkedlist_02_ list = new linkedlist_02_();

        list.addFirst("anshu");
        list.addFirst("good boy");
        list.printList();
    }
}