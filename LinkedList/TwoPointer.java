import java.util.*;
public class TwoPointer {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        void display() {
            Node currentNode = head;
            while (currentNode!= null) {
                size++;
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
        public  int getValue(int ind){
            Node slow = head;
            Node fast = head;
            for(int i = 0; i < ind; i++){
                fast = fast.next;
            }
            while(fast!= null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of LinkedList: ");
        int n = sc.nextInt();
        Linkedlist ll = new Linkedlist();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextInt());
        }
        ll.display();
        System.out.print("Enter Index: ");
        int ind = sc.nextInt();
        System.out.println(ll.getValue(ind));
    }
}
