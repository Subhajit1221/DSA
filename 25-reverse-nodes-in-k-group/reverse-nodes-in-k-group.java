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

    public ListNode reverse(ListNode temp){

        

        ListNode prev=null;
        ListNode curr=temp;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;

        
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null || k==1){
            return head;
        }


        ListNode dummy=new ListNode(0);

        dummy.next=head;

        ListNode prevgrpend=dummy;
        ListNode grpsrt;
        ListNode kth=dummy.next;
        ListNode nextgrp=null;

        

        while(kth != null ){

            grpsrt = prevgrpend.next;
            
            int count=0;
            while(kth != null && count<k-1){
               kth=kth.next;
               count++;
            }

            if(kth!=null){
                nextgrp=kth.next;

                kth.next=null;

                prevgrpend.next=reverse(grpsrt);

                grpsrt.next=nextgrp;

                prevgrpend=grpsrt;

                kth=nextgrp;

                
            }else{
                return dummy.next;
            }
        }


        return dummy.next;

        
        
    }
}