package util;
import java.util.List;

import dataStructure.TreeNode;

public class DataUtil {


	public static void preOrderTraversal(TreeNode root, List<Integer> result) {
		if(root == null) {
			return;
		}
		result.add(root.val);
		preOrderTraversal(root.left, result);
		preOrderTraversal(root.right, result);
		
	}
}
