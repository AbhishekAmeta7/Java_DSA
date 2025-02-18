public class InsertAtHead {
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
            } else{
                tail.next = newNode;
                tail = newNode;
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
        void insertAtHead(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
        ll.insertAtHead(23);
        System.out.println("\nAfter inserting at head: ");
        ll.display();
    }
}
