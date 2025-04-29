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
    int getSize(ListNode head){

        int counter =0 ;
        while(head!=null){
            counter++;
            head = head.next;
        }
        return counter;
    }
    void getElementsList(int arr[], ListNode head){
        int i=0;
        while(head!=null){
            arr[i] = head.val;
            head = head.next;
            i++;
        }

    }
    void reverse(int arr[]){

        int i= 0;
        int j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    boolean compare(ListNode head, int arr[] ){
        int i=0;
        while(head!=null){
            if(arr[i]==head.val){
                i++;
                head= head.next;
            }
            else{
                return false;
            }
        }

        return true;
    }
    void print(int arr[]){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public boolean isPalindrome(ListNode head) {
        int size = getSize(head);
        int arr[]= new int[size];
        getElementsList(arr, head);
        // print(arr);
        reverse(arr);
        // print(arr);
        return compare(head, arr);

    }
}
