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

       
        

        ListNode pre=head;

        ListNode post=head;

        int count=1;

        

        
        while(right!=count){
            
            if(left-1>count){
                pre=pre.next;
                
            }
            
            post=post.next;

            count++;
        }

        


       

        ListNode prev=post.next;

        post.next=null;

        
        ListNode curr= pre.next;
        if(left==1){
            curr= head; 
        }

        while(curr != null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        
        

        if(left==1){
           head=prev; 
        }else{
            pre.next=prev;
        }


        return head;



    }
}