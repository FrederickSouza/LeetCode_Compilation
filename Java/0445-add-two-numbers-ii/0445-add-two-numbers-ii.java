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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       	Stack<Integer> pilha1 = new Stack<>();
		Stack<Integer> pilha2 = new Stack<>();
		
		while(l1 != null) {
			pilha1.push(l1.val);
			l1 = l1.next;
		}
		while(l2 != null) {
			pilha2.push(l2.val);
			l2 = l2.next;
		}
		
		int sum = 0;
		ListNode lista = new ListNode(0);
		while(!pilha1.empty() || !pilha2.empty()) {
			if(!pilha1.empty()) sum += pilha1.pop();
			if(!pilha2.empty()) sum += pilha2.pop();
			
			lista.val = sum % 10;
			ListNode aux = new ListNode(sum/10, lista);
			lista = aux;
			sum = sum/10;
			
		}
		
		return lista.val == 0 ? lista.next : lista; 
    }
}