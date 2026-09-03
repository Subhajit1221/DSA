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
    public boolean isPalindrome(ListNode head) {
         ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr;

        if(fast==null){
             curr = slow;
        }else{
            curr = slow.next;
        }

        ListNode prev = null;
        
        
        
         while (curr != null) {
            ListNode nextNode = curr.next; // Store the next node
            curr.next = prev;              // Reverse the current node's pointer
            prev = curr;                   // Move prev one step forward
            curr = nextNode;               // Move curr one step forward
        }

        slow=head;

        while(prev!=null){
            if(prev.val!=slow.val){

                return false;

            } 

               prev = prev.next;
            slow = slow.next;
        }

        return true;

    }
}