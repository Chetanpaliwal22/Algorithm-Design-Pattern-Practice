package com.concordia.algo;

import com.concordia.algo.Tree.Node;

public class CheckIfBST {
	Node root;

	public CheckIfBST() {
		this.root = null;
	}

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int a) {
			this.data = a;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		CheckIfBST object = new CheckIfBST();
		object.insertIntoTree(4);
		object.insertIntoTree(2);
		object.insertIntoTree(6);
		object.insertIntoTree(1);
		object.insertIntoTree(3);
		object.insertIntoTree(5);
		object.insertIntoTree(7);
		object.printPreOrderTraversal(object.root);
		System.out.println(object.checkBST(object.root));
	}

	private void printPreOrderTraversal(Node root2) {
		if (root2 == null) {
			return;
		}
		System.out.println(root2.data);
		printPreOrderTraversal(root2.left);
		printPreOrderTraversal(root2.right);

	}

	public boolean checkBST(Node root) {
		if (root == null) {
			return true;
		}

		if (root.right != null & root.left != null) {
			if (root.right.data <= root.data || root.left.data >= root.data) {

				return false;
			}
		}
		boolean checkFlag = false;

		checkFlag = checkBST(root.left);
		if (!checkFlag) {
			return false;
		}
		return checkBST(root.right);

	}

	public void insertIntoTree(int data) {
		root = this.insert(root, data);
	}

	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}

		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

}
