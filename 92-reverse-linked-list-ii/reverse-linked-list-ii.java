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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy= new ListNode(0);

        dummy.next=head;

        int count=0;

        ListNode pre=dummy;

        while(count<left-1){
             pre= pre.next;
             count++;


        }

        ListNode curr= pre.next;

        ListNode prev= null;
        int i=0;

        while(curr!= null && i<right-left+1){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        
        pre.next.next=curr;
        pre.next=prev;

        return dummy.next;
        
    }
}