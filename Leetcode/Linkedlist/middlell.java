package Leetcode.Linkedlist;
// 876. Middle of the Linked List

// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        ListN
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}