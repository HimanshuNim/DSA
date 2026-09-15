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
    public ListNode middleNode(ListNode head) {
        ListNode middel=head;
        ListNode end=head;

        while(end!=null && end.next!=null) {
            middel=middel.next;
            end=end.next.next;
        }

        return middel;
    }
}