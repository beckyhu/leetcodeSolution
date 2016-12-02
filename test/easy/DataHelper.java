package easy;

import java.util.LinkedList;

import dataStructure.ListNode;
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
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		n3.left = n7;
		n3.right = n8;
		n8.left = n9;
		return root;
	}
	
	/**
	 *            4
	 *           / \
	 *          2   7
	 *         / \ / \
	 *        1  3 6  9
	 *        
	 *            4
	 *           / \
	 *          7   2
	 *         / \ / \
	 *        9  6 3  1
	 * @return
	 */
	public static TreeNode generateBinTree2() {
		TreeNode root = new TreeNode(4);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(7);
		TreeNode n3 = new TreeNode(1);
		TreeNode n4 = new TreeNode(3);
		TreeNode n5 = new TreeNode(6);
		TreeNode n6 = new TreeNode(9);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		return root;
	}
}
