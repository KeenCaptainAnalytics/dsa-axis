class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    static Node insert(int data, Node head){
        Node currHead = head;
        if(head == null){
            head = new Node(data);
            return head ;
        }
        else{
            while(head.next!=null){
                head =head.next;
            }
            head.next = new Node(data);
        }
        return currHead;
    }

    static void printList(Node head){

        while(head!=null){
            System.out.print(head.data+"=>");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node first =  insert(10, null);
        insert(20,first);
        insert(30,first);
        insert(40,first);
        insert(50,first);
        insert(60,first);
        insert(70,first);
        insert(80,first);
        insert(90,first);

        printList(first);
        // first.next = new Node(20);
        // first.next.next =new Node(30);
        // first.next.next.next = new Node(40);
        // first.next.next.next.next = new Node(50);
        
    }
}
