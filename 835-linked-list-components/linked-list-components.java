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
    public int numComponents(ListNode head, int[] nums) {
        int count = 0;  
        Set<Integer> set = new HashSet<>();  
         
        for (int value : nums) {
            set.add(value);
        }        
        while (head != null) {
            
            while (head != null && !set.contains(head.val)) {
                head = head.next;
            }  
            if (head != null) {
                count++;
                
                while (head != null && set.contains(head.val)) {
                    head = head.next;
                }
            }
        }
        return count;
    }
}