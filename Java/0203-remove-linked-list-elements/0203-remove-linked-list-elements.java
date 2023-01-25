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
    public ListNode removeElements(ListNode head, int val) {
        ListNode aux = new ListNode(-1, head);
		ListNode cur = aux;
		
		while(cur != null && cur.next != null) {
			if(cur.next.val != val) {
				cur = cur.next;
			} else {
				cur.next = cur.next.next;
			}
		}
		
		return aux.next;
    }
}