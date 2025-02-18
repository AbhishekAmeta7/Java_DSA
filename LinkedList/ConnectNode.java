public class ConnectNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //Connected Node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(a.data+" "+b.data+" "+c.data+" "+d.data+" "+e.data+" ");
        System.out.println(a.next+" "+b.next+" "+c.next+" "+d.next+" "+e.next+" ");
    }
}
