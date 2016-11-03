package dataStructure;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
	
	public TreeNode(int x, TreeNode left, TreeNode right) {
		this.left = left;
		this.right = right;
	}
}

