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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        k=k%count;
  
        // ListNode curr = head;
        while(k!=0){
        ListNode pre = null;
        ListNode curr = head;
        while(curr.next!=null){
            pre=curr;
            curr=curr.next;    
        }
        curr.next=head;
        head=curr;
        pre.next=null;
        k--;
        
        }

        return head;
        
    }
}