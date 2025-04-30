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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }


        if(list1.val< list2.val){
            ListNode temp = mergeTwoLists(list1.next, list2);
            list1.next = temp;
            return list1;
        }
        else{
            ListNode temp = mergeTwoLists(list1, list2.next);
            list2.next = temp;
            return list2;
        }

        // return null;
    }
}
