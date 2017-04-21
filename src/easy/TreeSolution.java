package easy;

import java.util.Stack;

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
	
	/**
	 * 404. Sum of Left Leaves
	 * https://leetcode.com/problems/sum-of-left-leaves/
	 * recursion
	 */
	public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        int sum = 0;
        if(root.left != null) {
        	if(root.left.left == null && root.left.right == null) {
        		sum += root.left.val;
        	} else {
        		sum += sumOfLeftLeaves(root.left);
        	}
        }
        if(root.right != null) {
        	sum += sumOfLeftLeaves(root.right);
        }
		return sum;
    }
	/**
	 * 404. Sum of Left Leaves
	 * iteration
	 */
	public int sumOfLeftLeaves2(TreeNode root) {
		int sum = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if(node != null) {
				if(node.left != null && node.left.left == null && node.left.right == null) {
					sum += node.left.val;
				} 
				stack.push(node.left);
				stack.push(node.right);
			}
		}
		return sum;
	}

	/**
	 * 100. Same Tree
	 * https://leetcode.com/problems/same-tree/
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
        
		return true;
    }
}
