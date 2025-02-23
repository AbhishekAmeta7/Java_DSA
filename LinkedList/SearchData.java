import java.util.*;
public class SearchData{
    static class Node{
        int data;
        Node next;
        
        Node(int data){
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
            }
            tail = newNode;
        }
        
        public void display(){
            Node curNode = head;
            while(curNode != null){
                System.out.print(curNode.data+" ");
                curNode = curNode.next;
            }
        }
        public int search(int val){
            Node temp = head;
            int size = 0;
            int i = 0;
            while(temp != null){
                size++;
                temp = temp.next;
            }
            temp = head;
            for(i = 0; i < size-1; i++){
                if(temp.data==val){
                    return i+1;
                }
                temp = temp.next;
                
            }
            return -1;
        }
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of LinkedList: ");
        int n = sc.nextInt();
        Linkedlist ll = new Linkedlist();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        ll.display();
        System.out.print("\nEnter Search Element: ");
        int s = sc.nextInt();
        if(ll.search(s) >= 0){
            System.out.println(s+" is present at position "+ll.search(s));
        }
        else{
            System.out.println(s+" is not present in the linked list.");
        }
    }
}