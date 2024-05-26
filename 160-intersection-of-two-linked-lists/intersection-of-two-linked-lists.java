/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        ListNode p1=headA;
        ListNode p2=headB;

        while(p1!=null){
            lenA++;
            p1=p1.next;
        }
        int lenB=0;
        while(p2!=null){
            lenB++;
            p2=p2.next;
        }
        while(lenA > lenB){
            lenA--;
            headA=headA.next;
        }
        while(lenB > lenA){
            lenB--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
        
    }
}