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
    public ListNode removeElements(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.val == k){
            return removeElements(head.next,k);
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp !=null){
            if(temp.val!=k){
                prev=temp;
            }else{
                prev.next = temp.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
