package easy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dataStructure.ListNode;

public class TestListSolution {

	private ListSolution listSolution;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		listSolution = new ListSolution();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testdeleteNode() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		listSolution.deleteNode(node3);

		Assert.assertTrue(node1.next.next.val == 4);
		
	}

}
