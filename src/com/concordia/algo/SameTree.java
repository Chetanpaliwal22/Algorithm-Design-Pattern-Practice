package com.concordia.algo;

//Check if two tree are same or not.

public class SameTree {

	Node root;

	public SameTree() {
		this.root = null;
	}

	class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.left = this.right = null;
			this.data = data;
		}

	}

	public static void main(String[] args) {

		SameTree firstTree = new SameTree();

		firstTree.insertIntoTree(3);
		firstTree.insertIntoTree(4);
		firstTree.insertIntoTree(6);
		firstTree.insertIntoTree(9);
		firstTree.insertIntoTree(10);
		firstTree.insertIntoTree(2);

		SameTree secondTree = new SameTree();
		secondTree.insertIntoTree(3);

		secondTree.insertIntoTree(4);
		secondTree.insertIntoTree(6);
		secondTree.insertIntoTree(9);
		secondTree.insertIntoTree(10);
		secondTree.insertIntoTree(2);

		firstTree.printInOrderTraversal(firstTree.root);
		secondTree.printInOrderTraversal(secondTree.root);

		System.out.println(firstTree.compareTree(firstTree.root, secondTree.root));
	}

	public boolean compareTree(Node firstTreeNode, Node secondTreeNode) {
		if (firstTreeNode == null & secondTreeNode == null) {
			return true;
		}
		if (firstTreeNode == null & secondTreeNode != null) {
			return false;
		} else if (firstTreeNode != null & secondTreeNode == null) {
			return false;
		} else {

			return (firstTreeNode.data == secondTreeNode.data & compareTree(firstTreeNode.left, secondTreeNode.left)
					& compareTree(firstTreeNode.right, secondTreeNode.right));
		}

	}

	public void printInOrderTraversal(Node root) {
		if (root == null)
			return;

		printInOrderTraversal(root.left);
		System.out.println(root.data);
		printInOrderTraversal(root.right);
	}

	public void insertIntoTree(int data) {
		root = insert(root, data);
	}

	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}

		if (data > root.data) {
			root.right = insert(root.right, data);
		} else {
			root.left = insert(root.left, data);
		}
		return root;
	}

}
