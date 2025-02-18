public class AddDataLinkedList {
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
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
        ll.add(25);
        ll.display();
    }
}
