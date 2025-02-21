import java.util.*;
public class RemoveElement {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static class LinkedList{
        Node head = null;
        Node tail = null;
        void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else{
                tail.next = newNode;
            }
            tail = newNode;
        }
        void display(){
            Node currentNode = head;
            while(currentNode!= null){
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        void removeElement(int data){
            if(head == null)
                return;
            if(head.data == data){
                head = head.next;
                if(head == null)
                    tail = null;
                return;
            }
            Node current = head;
            while(current.next!= null && current.next.data!= data){
                current = current.next;
            }
            if(current.next!= null)
                current.next = current.next.next;
            if(current.next == null)
                tail = current;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        System.out.print("Enter the number of elements in the Linkedlist: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        ll.display();
        System.out.print("\nEnter the element to be removed: ");
        int removeElement = sc.nextInt();
        ll.removeElement(removeElement);
        System.out.println("\nAfter removing the element: ");
        ll.display();
    }
}
