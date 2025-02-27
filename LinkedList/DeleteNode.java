public class DeleteNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class Linkedlist {
        public void display(Node head){
			Node curNode = head;
			while(curNode != null) {
				System.out.print(curNode.data+" ");
				curNode = curNode.next;
			}
		}
		public void removeNode(Node head,Node node) {
			Node slow = head;
            Node fast = head;
            while(fast != null && fast.next!=null){
            	if(slow.next==node){
                    slow.next = slow.next.next;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println();
            display(head);
		}  
    }
    public static void main(String[] args) {
        Node a = new Node(4);
		Node b = new Node(5);
		Node c = new Node(1);
		Node d = new Node(9);
		Node e = new Node(50);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		
		Linkedlist ll = new Linkedlist();
		ll.display(a);
		ll.removeNode(a, c);
    }    
}
