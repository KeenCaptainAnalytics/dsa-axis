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

    ArrayList<Integer> getArr(ListNode head){

        ArrayList<Integer> ans = new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head = head.next;
        }
        return ans;
    }
    public ListNode reverseList(ListNode head) {
         ArrayList<Integer> ans = getArr(head);
         ListNode temp = head;
         for(int i=ans.size()-1;i>=0;i--){
            temp.val = ans.get(i);
            temp= temp.next;
         }

         return head;
    }
}
