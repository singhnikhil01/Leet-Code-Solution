/*Reverse Linked List
Easy

12286

214

Add to List

Share
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 
*/
class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode pnt=null;
        ListNode prev= null;
        while(temp!=null)
        {
            pnt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = pnt;
        }
        head = prev;
        return head;
        
    }
}
