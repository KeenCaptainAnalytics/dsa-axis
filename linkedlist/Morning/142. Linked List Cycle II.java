/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode , ListNode> ans = new HashMap<>();

        ListNode dummyHead = new ListNode();
        dummyHead.next= head;
        ListNode temp = dummyHead;
        while(head!=null){
            if(ans.containsKey(head)){
                temp= head;
                return head;
                // break;
            }
            else{
                ans.put(head, temp);
            }
            
            head = head.next;
            
            temp= temp.next;
            
        }       

return null;

        // int counter =-1 ;
        // while(dummyHead !=null){
           
        //     if(dummyHead == temp ){
        //         break;
        //     }
        //     dummyHead = dummyHead.next;
        //      counter++;
        // }

        // return counter;
    }
}
