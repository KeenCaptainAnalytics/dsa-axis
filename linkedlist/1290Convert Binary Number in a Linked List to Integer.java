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
    int getLength(ListNode head){
        int len =0;
        while(head!=null){
            len++;
            head= head.next;
        }
        return len;
    }
    public int getDecimalValue(ListNode head) {
        int num =0;
        int len = getLength(head);

        while(head!=null){
            num = num + head.val*(int)(Math.pow(2,len-1));
            len = len-1;
            head = head.next;
        }

        return num;
    }
}
