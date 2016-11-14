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
	/**
	 * 226. Invert Binary Tree
	 * https://leetcode.com/problems/invert-binary-tree/
	 */
	public TreeNode invertTree(TreeNode root) {
        if(root != null) {
        	recursiveInvertTree(root);
        }
		return root;
    }
	private void recursiveInvertTree(TreeNode root) {
		if(root == null) {
			return;
		}
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		invertTree(root.left);
		invertTree(root.right);
	}
	
}
