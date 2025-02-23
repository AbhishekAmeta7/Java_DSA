import java.util.*;
public class ReverseSinglyLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    static class Linkedlist{
        Node head = null;
        Node tail = null;
        void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            } 
            else{
                tail.next = newNode;
            }
            tail = newNode;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            Node curNode = head;
            System.out.println("\nReverse Order");
            reverse(curNode);
        }
        void reverse(Node temp){
            if(temp == null){
                return;
            }
            reverse(temp.next);
            System.out.print(temp.data+" ");
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes in the linked list: ");
        int n = sc.nextInt();
        Linkedlist ll = new Linkedlist();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        ll.display();
    }
}
