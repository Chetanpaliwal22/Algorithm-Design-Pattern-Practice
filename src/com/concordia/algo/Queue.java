package com.concordia.algo;

/*
 * implementation of stack(LIFO) and its method peek push pop
 */
public class Queue {

	Node first, last;

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(5);
		int lastElement = queue.dequeue();

	}

	/*
	 * dequeue implementation
	 */
	private int dequeue() {
		if (first != null) {
			int nodedata = first.data;
			first = first.next;
			if (first == null)
				last = null;
			return nodedata;
		}
		return 0;
	}

	/*
	 * enqueue implementation
	 */
	private void enqueue(int i) {
		Node newNode = new Node(i);
		if (first == null) {
			first = newNode;
			last = first;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
}
