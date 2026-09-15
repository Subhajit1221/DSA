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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode left=head;
        

        ListNode prevleft=null;

        while (left != null && left.next != null){

            ListNode right=left.next;

            ListNode nextleft=right.next;
             
             right.next=left;
             left.next=nextleft;

             if(prevleft==null){
                head=right;
             }else{
                prevleft.next=right;
             }


             prevleft=left;
             left=nextleft;
            

        }

        return head;
        
    }
}