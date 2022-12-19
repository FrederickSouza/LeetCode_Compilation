

public class MergeTwoSortedLists {

	public static void solution() {
		//MergeTwoSortedLists aux = new MergeTwoSortedLists();
		int[] arr1 = {1,2,4,5};
		int[] arr2 = {-2,-1,1,3,3,5};
		
		ListNode l1 = ListNode.factory(arr1);
		ListNode l2 = ListNode.factory(arr2);
		
		ListNode merged = ListNode.mergeTwoLists(l1, l2);

		ListNode.printListNode(merged);
		
		
		
		//ListNode.factory();
		
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		
		public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			MergeTwoSortedLists auxFact = new MergeTwoSortedLists();
			ListNode auxHead = auxFact.new ListNode();
			ListNode current = auxHead;
			
			while ( null != list1 && null != list2 ) {
				
				if ( list1.val<=list2.val ) {
					System.out.print(list1.val + ". ");
					current.next = list1;
					list1 = list1.next;
				} else {
					System.out.print(list2.val + ", ");
					current.next = list2;
					list2 = list2.next;
				}
				
				current = current.next;
			}
			
			current.next = ( (null != list1) ? list1 : list2);
			System.out.println();
			
			return auxHead.next;
		}
		
		public static void printListNode(ListNode ln) {
			while(ln.next != null) {
				System.out.print(ln.val + " ");
				ln = ln.next;
			}
			System.out.println();
		}
		
		public static ListNode factory (int[] arr) {
			MergeTwoSortedLists aux = new MergeTwoSortedLists();
			ListNode lnAux = aux.new ListNode();
			
			if (arr == null) {
				return lnAux;
			}
			
			for(int i=arr.length-1; i>=0; i--) {
				ListNode ln = aux.new ListNode(arr[i], lnAux);
				//System.out.println("ln.val: " + ln.val + " | lnAux.val: " + lnAux.val);
				lnAux = ln;
			}
			
			//System.out.println("okay");
			return lnAux;
		}
	}

	
	
	class Solution {
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        
	    	return null;
	    }
	}
}
