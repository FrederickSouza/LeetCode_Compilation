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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode auxHead = new ListNode();
		ListNode current = auxHead;
		
		while ( null != list1 && null != list2 ) {
			
			if ( list1.val<=list2.val ) {
				//System.out.print(list1.val + ". ");
				current.next = list1;
				list1 = list1.next;
			} else {
				//System.out.print(list2.val + ", ");
				current.next = list2;
				list2 = list2.next;
			}
			
			current = current.next;
		}
			
		current.next = ( (null != list1) ? list1 : list2);
		//System.out.println();
			
		return auxHead.next;		
    }
}