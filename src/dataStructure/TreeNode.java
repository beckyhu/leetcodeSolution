package dataStructure;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	int val;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
	
	public TreeNode(int x, TreeNode left, TreeNode right) {
		this.left = left;
		this.right = right;
	}
	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}

