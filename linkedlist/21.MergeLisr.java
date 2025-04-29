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
    void putElements(ArrayList<Integer> ans,ListNode list1, ListNode list2) {
        while(list1!=null){
            ans.add(list1.val);
            list1 = list1.next;
        }

        while(list2!=null){
            ans.add(list2.val);
            list2 = list2.next;
        }

    }  
    void mergeAndAdd( ArrayList<Integer> ans,ListNode list1, ListNode list2 ){
        ListNode temp = list1;

        while(temp.next !=null){
            temp= temp.next;
        }
        temp.next = list2;

        int i=0;
        while(list1!=null){
            list1.val= ans.get(i);
            i++;
            list1= list1.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        putElements(ans, list1, list2);
        Collections.sort(ans);
        // System.out.println(ans);
        mergeAndAdd(ans, list1, list2);
        return list1;
    }
}
