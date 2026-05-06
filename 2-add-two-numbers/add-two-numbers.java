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

    public static ListNode add(ListNode tail, int data) {
        ListNode temp = new ListNode(data);
        tail.next = temp;
        return temp; // return new tail
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;
        int c = 0;

        sum = l1.val + l2.val + c;
        c = sum / 10;
        sum = sum % 10;

        ListNode head = new ListNode(sum);
        ListNode tail = head;

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + c;
            c = sum / 10;
            sum = sum % 10;

            tail = add(tail, sum);

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + c;
            c = sum / 10;
            sum = sum % 10;

            tail = add(tail, sum);
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + c;
            c = sum / 10;
            sum = sum % 10;

            tail = add(tail, sum);
            l2 = l2.next;
        }

        if (c != 0) {
            tail.next = new ListNode(c);
        }

        return head;
    }
}