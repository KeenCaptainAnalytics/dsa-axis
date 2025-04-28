
class LLNode{
    int data ;
    LLNode next;

    LLNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class ALinkedList {
    static void print(LLNode head){
        while(head!=null){
            System.out.print(head.data+" => ");
            head = head.next;
        }
    }

    static LLNode  insert(int data, LLNode head){
        LLNode temp =  new LLNode(data);
        if(head==null){
            return temp;
        }
        else{
            while(head.next!=null){
                head = head.next;
            }
            head.next= temp;
        }
        return null;
    }
    public static void main(String[] args) {
        LLNode first = insert(10, null);
        insert(20, first);
        insert(30, first);
        insert(40, first);
        insert(50, first);
        insert(60, first);
        
        print(first);

    }
}
