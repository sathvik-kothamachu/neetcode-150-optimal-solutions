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
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;

        while (head != null) {
            ListNode next = head.next; // Save next node

            head.next = tail;         // Reverse the link

            tail = head;              // Move tail forward
            head = next;              // Move head forward
        }

        return tail;
    }
}