public class PrintData {
    static class Node{
        int data;
        Node ref;
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
        System.out.println(a.data+" "+b.data+" "+c.data+" "+d.data+" "+e.data+" ");
    }
}
