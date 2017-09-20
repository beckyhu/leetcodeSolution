package easy;

import dataStructure.ListNode;

public class ListSolution {

	/**
	 * 237. Delete Node in a Linked List
	 * https://leetcode.com/problems/delete-node-in-a-linked-list/
	 */
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
	/**
	 * 21. Merge Two Sorted Lists
	 * @param l1
	 * @param l2
	 * @return
	 */
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode dummy = new ListNode(0);
		 ListNode merged = dummy;
		 while(l1 != null && l2 != null) {
			 if(l1.val <= l2.val) {
				 merged.next = l1;
				 l1 = l1.next;
			 }else {
				 merged.next = l2;
				 l2 = l2.next;
			 }
			 merged = merged.next;
		 }
		 if(l1 != null){
			 merged.next = l1;
		 }else{
			 merged.next = l2;
		 }
		 return dummy.next;
	 }
}
