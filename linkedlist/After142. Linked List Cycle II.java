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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> list = new HashSet<>();

        while(head!=null){
            if(list.contains(head)){
                return true;
            }
            else{
                list.add(head);
            }

            head = head.next;
        }

        return false;
    }
}
