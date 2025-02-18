public class PrintLinkedlist {
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(11);
       Node b = new Node(22);
       Node c = new Node(33);
       Node d = new Node(44);
       Node e = new Node(55);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = null;
       Node temp = a;
       for(Node i = a;i!=null;i=i.next){
         System.out.print(i.value + " ");
       }
    //    while(temp!=null) {
    //      System.out.print(temp.value + " ");
    //      temp = temp.next;  // Move to the next node in the linked list.
    //    }
    }
}
