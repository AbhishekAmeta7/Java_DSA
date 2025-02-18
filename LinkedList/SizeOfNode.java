public class SizeOfNode {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(45);
        Node c = new Node(67);
        Node d = new Node(70);
        Node e = new Node(90);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(size(a));
    }
}
