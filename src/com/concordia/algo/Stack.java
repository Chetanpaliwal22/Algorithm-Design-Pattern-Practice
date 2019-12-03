package com.concordia.algo;

/*
 * implementation of stack(LIFO) and its method peek push pop
 */
public class Stack {

	static Node top;

	public static void main(String[] args) {

		Stack stack = new Stack();
		int data = stack.peek();
		stack.push(3);
		int popValue = stack.pop();
	}

	/*
	 * pop implementation
	 */
	private int pop() {
		int nodedata = top.data;
		if (top != null) {
			top = top.next;
		}
		return nodedata;
	}

	/*
	 * push implementation
	 */
	private void push(int i) {
		Node newNode = new Node(i);
		newNode.next = top;
		top = newNode;
	}

	/*
	 * peek implementation
	 */
	private int peek() {
		return top.data;
	}

}
