package com.concordia.algo;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class SumNodeEvenGrandParent {
	int sum = 0;

	public int sumEvenGrandparent(TreeNode root) {
		if (root == null) {
			return 0;
		}
		sumTree(root);
		return sum;
	}

	public void sumTree(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.val % 2 == 0) {
			if (root.left != null) {
				if (root.left.left != null) {
					sum += root.left.left.val;
				}

				if (root.left.right != null) {
					sum += root.left.right.val;
				}
			}

			if (root.right != null) {
				if (root.right.left != null) {
					sum += root.right.left.val;
				}

				if (root.right.right != null) {
					sum += root.right.right.val;
				}
			}
		}

		sumTree(root.left);
		sumTree(root.right);

	}
}
