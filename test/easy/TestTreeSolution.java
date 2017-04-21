package easy;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dataStructure.TreeNode;
import util.DataUtil;


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
		Assert.assertEquals("TreeMaxDepth:", 5, maxDepth);
	}
	@Test
	public void testinvertTree() {
		TreeNode root = DataHelper.generateBinTree2();
		TreeNode invertedTree = treeSolution.invertTree(root);
		List<Integer> preOrderTraversalList = new LinkedList<Integer>();
		DataUtil.preOrderTraversal(invertedTree, preOrderTraversalList);
		Integer[] expect = new Integer[] {4, 7, 9, 6, 2, 3, 1};
		Assert.assertArrayEquals("InvertTree preOrder result: ", expect, preOrderTraversalList.toArray());
	}
	
	@Test
	public void testsumOfLeftLeaves() {
		TreeNode root = DataHelper.generateBinTree1();
		int result = treeSolution.sumOfLeftLeaves(root);
		Assert.assertEquals("sumOfLeftLeaves:", 21, result);
		result = treeSolution.sumOfLeftLeaves2(root);
		Assert.assertEquals("sumOfLeftLeaves2:", 21, result);
	}
	
	@Test
	public void testisSameTree() {
		
	}
}
