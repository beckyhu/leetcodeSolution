package medium;

import static org.junit.Assert.*;

import org.junit.Test;

import dataStructure.ListNode;
import medium.MNumberSolution;

public class TestMNumberSolution {
	private MNumberSolution numberM = new MNumberSolution();
	@Test
	public void testAddTwoNumbers() {
		ListNode ln = new ListNode(2);
		ln.next = new ListNode(4);
		ln.next.next = new ListNode(3);
		ln.next.next.next = null;
		
		ListNode ln2 = new ListNode(5);
		ln2.next = new ListNode(6);
		ln2.next.next = new ListNode(4);
		ln2.next.next.next = null;
		
		ListNode result = numberM.addTwoNumbers(ln, ln2);
		assertEquals(7, result.val);
		assertEquals(0, result.next.val);
		assertEquals(8, result.next.next.val);
		
		ln2.next.next.next = new ListNode(1);
		ListNode result2 = numberM.addTwoNumbers(ln, ln2);
		assertEquals(1, result2.next.next.next.val);
	}

}
