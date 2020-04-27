package com.concordia.algo;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class NumberNode {
	public int countNodes(TreeNode root) {

		if (root == null) {
			return 0;
		}
		return 1 + countNodes(root.left) + countNodes(root.right);
	}

}
