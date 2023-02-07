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
        Set<ListNode> bau = new HashSet();	
        
        while(headA != null && headB != null) {
        	if(bau.add(headA)) {
        		headA = headA.next;
        	} else {
        		return headA;
        	}
        		
        	if(bau.add(headB)) {
        		headB = headB.next;
        	} else {
        		return headB;
        	}
        }
        
        ListNode temp = null;
        if(headA != null) {
            temp = headA;
        } else if (headB != null) {
        	temp = headB;
        }
        
        while(temp != null) {
        	if(bau.add(temp)) {
        		temp = temp.next;
        	} else {
        		return temp;
        	}
        }
        
    	
    	return null;
    }
}