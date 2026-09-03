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
    public void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr;
        
        curr = slow.next;
        slow.next = null;

        ListNode prev=null;

        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        
        }
        slow=head;

        while(prev!=null){
            ListNode t1=slow.next;
            ListNode t2=prev.next;
            slow.next=prev;
            prev.next=t1;

            slow=t1;
            prev=t2;
        }
    }
}