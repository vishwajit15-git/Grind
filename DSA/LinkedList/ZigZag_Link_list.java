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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getMidNode(head);
        ListNode secondHalfHead = mid.next;
        mid.next = null;

        ListNode prev=null;
        ListNode curr=secondHalfHead;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode RH=prev;
        ListNode LH=head;

        ListNode nextLH;
        ListNode nextRH;

        while(LH!=null && RH!=null){
            nextLH=LH.next;
            LH.next=RH;
            nextRH=RH.next;
            RH.next=nextLH;

            RH=nextRH;
            LH=nextLH;
        }
    }
    public ListNode getMidNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}