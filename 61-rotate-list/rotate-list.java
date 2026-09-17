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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null || k==0){
            return head;
        }

        ListNode tail=head;
        int count=1;

        while(tail.next!=null){
            tail=tail.next;
            count++;
        }

        
        


        k=k%count;

        if(k==0){
            return head;
        }

        

        ListNode temp=head;
        
        int n=1;

        


        while(n<count-k){
            temp=temp.next;
            n++;
        }

        System.out.println(temp.val);


        tail.next=head;
       head= temp.next;
       temp.next=null;

        return head;
        
    }
}