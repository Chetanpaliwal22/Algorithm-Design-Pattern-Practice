
package com.concordia.algo;

import java.util.*;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class RightViewTree {
	public List<Integer> rightSideView(TreeNode root) {

		List<List<Integer>> listInt = new ArrayList<List<Integer>>();

		Queue<TreeNode> que = new LinkedList<TreeNode>();
		List<Integer> returnList = new ArrayList<Integer>();
		if (root == null) {
			return returnList;
		}

		que.add(root);
		List<Integer> firstlist = new ArrayList<Integer>();
		firstlist.add(root.val);
		listInt.add(firstlist);

		while (!que.isEmpty()) {
			int size = que.size();

			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode node = que.poll();

				if (node.left != null) {
					list.add(node.left.val);
					que.add(node.left);
				}

				if (node.right != null) {
					list.add(node.right.val);
					que.add(node.right);
				}
			}
			if (list.size() > 0) {
				listInt.add(list);
			}

		}

		for (int i = 0; i < listInt.size(); i++) {
			returnList.add(listInt.get(i).get(listInt.get(i).size() - 1));
		}
		return returnList;

	}
}
