package hard;

import dataStructure.ListNode;

public class HListSolution {
	/**
	 * 23. Merge k Sorted Lists
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeHelper(lists, 0, lists.length - 1);
    }
    private ListNode mergeHelper(ListNode[] lists, int start, int end) {
        if(start == end) {
            return lists[start];
        }
        int mid = start + (end-start)/2;
        ListNode l1 = mergeHelper(lists, start, mid);
        ListNode l2 = mergeHelper(lists, mid+1, end);
        return mergeTwo(l1, l2);
    }
    private ListNode mergeTwo(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode merged = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                merged.next = l1;
                l1 = l1.next;
            }else{
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }
        if(l1 != null) {
            merged.next = l1;
        }else{
            merged.next =l2;
        }
        return dummy.next;
    }
}
