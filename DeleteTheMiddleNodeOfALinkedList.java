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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;

        /**
         * Count and then delete
         */
        // int n = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     n++;
        //     temp = temp.next;
        // }

        // if(n == 1){
        //     return null;
        // }

        // ListNode prev = head, newHead = head;
        // int count = 0;
        // while(count != n/2){
        //     prev = newHead;
        //     newHead = newHead.next;
        //     count++;
        // }

        // prev.next = newHead.next;

        // return head;

        /**
         * Fast and slow pointer
         */
        ListNode fast = head, slow = head;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}