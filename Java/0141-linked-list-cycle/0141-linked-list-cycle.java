/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
		if(head == null) {return false;}
		
		ListNode lnSlow = head;
		ListNode lnFast = head.next;
		
		while(lnSlow != lnFast) {
			if(lnSlow == null || lnFast == null || lnFast.next == null) {
				return false;
			}
			lnSlow = lnSlow.next;
			lnFast = lnFast.next.next;
		}
		
		return true;
    }
}