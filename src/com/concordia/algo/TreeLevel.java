package com.concordia.algo;

//input output
//traversal with value

public class TreeLevel {
	public Node root = null;

	class Node {

		Node left, right;
		int value;

		public Node(int value) {
			this.value = value;
			this.left = this.right = null;
		}
	}

	public static void main(String[] args) {
		TreeLevel tree = new TreeLevel();
		tree.insertIntoTree(3);
		tree.insertIntoTree(5);
		tree.insertIntoTree(8);
		System.out.println(tree.checkNodeLeve(8));
	}

	public int checkNodeLeve(int value) {
		int level = checkNodeLevel(root, value, 1);
		return level;
	}

	public int checkNodeLevel(Node root, int value, int level) {

		if (root == null) {
			return 0;
		}
		if (root.value == value) {
			return level;
		}

		int newlevel = checkNodeLevel(root.left, value, level + 1);
		if (newlevel != 0) {
			return level;
		}

		return checkNodeLevel(root.right, value, level + 1);
	}

	public void insertIntoTree(int value) {
		root = insert(this.root, value);
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		if (root.value > value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

}
