package com.concordia.algo;

import java.util.HashSet;

/*
 * Code to remove duplicate from an unsorted Linked list.
 */
public class LinkedList {

	static Node head;
	
	public static void main(String[] args) {
		
		Node linkedlist = new Node(3);
		
		LinkedList linkedList = new LinkedList(); 
        linkedList.head = new Node(4); 
        linkedList.head.next = new Node(5); 
        linkedList.head.next.next = new Node(5); 
        linkedList.head.next.next.next = new Node(8); 
        linkedList.head.next.next.next.next = new Node(2); 
        linkedList.head.next.next.next.next.next = new Node(7); 
        linkedList.head.next.next.next.next.next.next = new Node(7); 
		
        removeDuplicate(linkedList);
		// TODO Auto-generated method stub

	}

	private static void removeDuplicate(LinkedList linkedList) {
		// TODO Auto-generated method stub
		
		 HashSet<Integer> hashSet = new HashSet<>(); 
	      
	        Node current = head; 
	        Node prev = null; 
	        while (current != null)  
	        { 
	            int curval = current.data; 
	              
	             if (hashSet.contains(curval)) { 
	                prev.next = current.next; 
	            } else { 
	                hashSet.add(curval); 
	                prev = current; 
	            } 
	            current = current.next; 
	        } 
	}

	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
}
