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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
		
		ListNode aux = dummy;
		while(aux.next != null && aux.next.next != null) {
			ListNode first = aux.next;
			ListNode second = aux.next.next;
			first.next = first.next.next;
			second.next = first;
			aux.next = second;
			aux = first;
		}
		
		return dummy.next;
    }
}