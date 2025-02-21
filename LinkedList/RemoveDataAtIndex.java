import java.util.*;
public class RemoveDataAtIndex {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    static class LinkedList{
        Node head = null;
        Node tail = null;
        void add(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node curNode = head;
            while(curNode!= null){
                System.out.print(curNode.data + " ");
                curNode = curNode.next;
            }
        }
        void removeAt(int index){
            Node temp = head;
            int size = 0;
            while(temp != null){
                size++;
                temp = temp.next;
            }
            temp = head;
            for(int i = 1; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            System.out.println("After Remove");
            display();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        System.out.print("Enter the size of LinkedList: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        ll.display();
        System.out.print("\nEnter the index to remove: ");
        int index = sc.nextInt();
        ll.removeAt(index);
    }
}
