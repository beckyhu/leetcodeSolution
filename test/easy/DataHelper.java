package easy;

import dataStructure.TreeNode;

public class DataHelper {

	/**
	 *			 0
	 *			/ \
	 *		   1   2
	 *        /\   /\
	 *       3  4 5  6
	 *      /\
	 *     7  8
	 *       /
	 *      9
	 * @return
	 */
	public static TreeNode generateBinTree1() {
		TreeNode root = new TreeNode(0);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		TreeNode n9 = new TreeNode(9);
		root.setLeft(n1);
		root.setRight(n2);
		n1.setLeft(n3);
		n1.setRight(n4);
		n2.setLeft(n5);
		n2.setRight(n6);
		n3.setLeft(n7);
		n3.setRight(n8);
		n8.setLeft(n9);
		return root;
	}
}
