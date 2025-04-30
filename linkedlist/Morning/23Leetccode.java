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
    ListNode mergeTwoLists(ListNode first , ListNode second){
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        while(first!=null && second !=null){
            if(first.val<second.val){
                temp.next = first;
                first=first.next;
                temp= temp.next;
            }
            else{
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }

        if(first ==null){
            temp.next = second;
        }
        else{
            temp.next =first;
        }

        return dummyNode.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> ans = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ans.add(lists[i]);
        }

        if(ans.size()==0){
            return null;
        }
        while(ans.size()>=2){
            ListNode first = ans.get(ans.size()-1);
            ListNode second = ans.get(ans.size()-2);
            
            ans.remove(ans.size()-1);
            ans.remove(ans.size()-1);
            ListNode result  = mergeTwoLists(first, second);
           ans.add( result );
    
        }       
        return ans.get(0);
    }
}
