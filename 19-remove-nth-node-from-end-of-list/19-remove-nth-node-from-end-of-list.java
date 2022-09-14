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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode dummy=new ListNode(0,head);        
        ListNode leftPointer=dummy;
        ListNode rightPointer=head;
        
        //move the right pointer n times ahead from the head , so the offset between right and left pointer will be n.
        
        while(rightPointer!=null && n>0){
            rightPointer=rightPointer.next;
            n--;
        }

        // run a loop until right pointer becomes null so that left pointer will be at the nth position. 
        
        while(rightPointer!=null){
            rightPointer=rightPointer.next;
            leftPointer=leftPointer.next;
        }
        leftPointer.next=leftPointer.next.next;
        return dummy.next;
    }
}