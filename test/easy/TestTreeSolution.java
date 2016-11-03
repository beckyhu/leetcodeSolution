package easy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dataStructure.TreeNode;


public class TestTreeSolution {
	private TreeSolution treeSolution;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		treeSolution = new TreeSolution();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testmaxDepth() {
		TreeNode root = DataHelper.generateBinTree1();
		int maxDepth = treeSolution.maxDepth(root);
		Assert.assertEquals("TreeMaxDepth", 4, maxDepth);
	}

}
