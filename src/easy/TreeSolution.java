package easy;

import dataStructure.TreeNode;

public class TreeSolution {
	/**
	 * 104. Maximum Depth of Binary Tree 
	 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
	 */
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int maxLeft = maxDepth(root.left);
		int maxRight = maxDepth(root.right);
		return Math.max(maxLeft, maxRight) + 1;
	}
}
