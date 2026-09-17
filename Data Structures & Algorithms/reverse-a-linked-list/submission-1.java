class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {

            next = curr.next;      // Save the next node
            curr.next = prev;      // Reverse the link

            prev = curr;           // Move prev forward
            curr = next;           // Move curr forward
        }

        return prev;
    }
}