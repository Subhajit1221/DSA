/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode temp=head;

        List<ListNode> node=new ArrayList<>();

        int flag=1;

        while(flag!=0){

            if(temp!=null){

                if(!node.contains(temp)){
                node.add(temp);
                temp=temp.next;
            }else{
                flag=0;
            }

            }else{
                return false;
            }

            
        }

        return true;
        
    }
}