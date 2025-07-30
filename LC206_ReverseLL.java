class Solution{
  public ListNode reverse(ListNode head){
    ListNode prev = null;
    while(head!=null){
      ListNode after = head.next;
      head.next = prev;
      prev = head;
      head = after;
    }
    return prev;
  }
}
