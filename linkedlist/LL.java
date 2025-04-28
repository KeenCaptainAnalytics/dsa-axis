// class Node{
//     // data
//     int num;
//     char ch;
//     Node next;

//     Node(int num, char ch){
//         this.num = num;
//         this.ch = ch;
//     }
// }

class LL{

    static Node insert(int num , char ch, Node head){
        Node temp = new Node(num, ch);
        if(head ==null){
            return temp;
        }
        else{
            Node cn = head;

            while(cn.next!=null){
                cn = cn.next;
            }
            cn.next = temp;
        }
        return head;
    }
    static void printList(Node temp){
        while(temp!=null){
            System.out.print(temp.num+" = > ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        Node head  = insert(10, 'a', null);
        insert(20, 'b', head);
        insert(30, 'b', head);
        insert(40, 'b', head);
        insert(50, 'b', head);
        insert(60, 'b', head);
        insert(70, 'b', head);
        printList(head);
        // Node first = new Node(10, 'a');
        // first.next = new Node(20, 'b');
        // first.next.next = new Node(30, 'c');
        // first.next.next.next = new Node(40,'d');


        // Node first = new Node(10,'a');
        // Node second = new Node(20,'b');
        // Node third = new Node(30,'c');

        // first.next= second;
        // second.next = third;
     }
}