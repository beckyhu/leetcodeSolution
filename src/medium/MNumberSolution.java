package medium;

import dataStructure.ListNode;

public class MNumberSolution {
	/**
	 * 2. Add Two Numbers  
	 * https://leetcode.com/problems/add-two-numbers/#/description
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pResult = result;
        ListNode pL1 = l1;
        ListNode pL2 = l2;
        int carry = 0;
        
        while(pL1 != null || pL2 != null){
        	carry /= 10;
        	if(pL1 != null){
        		carry += pL1.val;
        		pL1 = pL1.next;
        	}
        	if(pL2 != null){
        		carry += pL2.val;
        		pL2 = pL2.next;
        	}
        	pResult.next = new ListNode(carry % 10);
        	pResult = pResult.next;
        }
        if(carry / 10 == 1){
        	pResult.next = new ListNode(1);
        }
        return result.next;
    }
}
