class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 1. Move `prev` to the node immediately before index `left`
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // 2. Head of the sublist to be reversed
        ListNode curr = prev.next;

        // 3. Repeatedly move `curr.next` to the front of the sublist
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}