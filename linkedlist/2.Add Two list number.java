/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        int sum =0;
        int carry =0;
        while(true){
            
            
            if(l1!=null && l2!=null){
                sum = l1.val +l2.val + carry;
                
                carry = sum/10; 
                int val = sum%10; 
                temp.next = new ListNode(val);
                l1 = l1.next;
                l2 = l2.next;
                temp = temp.next;
            }
            else if( l1 == null && l2!=null){
                sum = l2.val +carry;
                carry = sum/10; 
                int val = sum%10; 
                temp.next = new ListNode(val);
                l2 = l2.next;
                temp = temp.next;

            }
            else if(l1!=null && l2==null){
                sum = l1.val + carry;
                carry = sum/10;
                int val = sum%10;
                temp.next = new ListNode(val);
                l1=l1.next;
                temp = temp.next;
            }
            else {
                if(carry == 1){
                    temp.next = new ListNode(carry);
                    temp= temp.next;
                    break;
                }
                else{
                    break;
                }
            }
        }

        return dummyHead.next;
    }
}
