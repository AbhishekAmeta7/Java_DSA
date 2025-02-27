import java.util.Scanner;

public class DeleteNode {
    static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	static class Linkedlist{
		public void display(Node head){
			Node curNode = head;
			while(curNode != null) {
				System.out.print(curNode.data + " ");
				curNode = curNode.next;
			}
			System.out.println();
		}
		
		public Node removeNode(Node head, int value) {
			if (head == null) return null;
			if (head.data == value) return head.next;
			
			Node current = head;
			while (current.next != null) {
				if (current.next.data == value) {
					current.next = current.next.next;
					break;
				}
				current = current.next;
			}
			return head;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of nodes: ");
		int n = sc.nextInt();
		
		Node head = null, tail = null;
		System.out.println("Enter the node values: ");
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		
		Linkedlist ll = new Linkedlist();
		System.out.print("Initial Linked List: ");
		ll.display(head);
		
		System.out.print("Enter the value of the node to remove: ");
		int valueToRemove = sc.nextInt();
		
		head = ll.removeNode(head, valueToRemove);
		System.out.print("Linked List after removal: ");
		ll.display(head);
		
		sc.close();
	}    
}
