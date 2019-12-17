package com.concordia.algo;

//Input : Two tree.
//Output: True False/
//Constraint : You have to feed the data.

//DS: Tree
//No need to process the data.
//Steps:
//Create Node Tree class.
//Create insert method.
//Build the two Trees.
//Write a method to check if the traversal is in order or not
//Check the null condition for both the tree.
//If Check if the first is empty and the second is not empty
//Else if Other Way around condition
//else(check the left and right)
//Optimization- Removed the need of list2
//Code:

import java.util.List;
import java.util.ArrayList;
public class TreeOrder{
	public Node root; 

	public TreeOrder(){
		this.root = null;
	}

class Node{

	Node left,right;
	int data;

	public Node(int data){
this.left = this.right = null;
this.data = data;
}
}

public static void main(String[] args){

	TreeOrder firstTree = new TreeOrder();

	TreeOrder secondTree = new TreeOrder();

firstTree.insertIntoTree(1);
firstTree.insertIntoTree(3);
firstTree.insertIntoTree(5);
firstTree.insertIntoTree(7);
firstTree.insertIntoTree(6);

secondTree.insertIntoTree(1);
secondTree.insertIntoTree(3);
secondTree.insertIntoTree(6);
secondTree.insertIntoTree(5);
secondTree.insertIntoTree(7);
		//System.out.println(“First Tree In Order Traversal”);
List<Integer> list1 = new ArrayList<>();
//List<Integer> list2 = new ArrayList<>();

firstTree.printInOrderTraversal(firstTree.root,list1);
//System.out.println(“Second Tree In Order Traversal”);
System.out.println(secondTree.printCheckinOrderTraversal(secondTree.root,list1));
//System.out.println(list1.equals(list2));
//System.out.println(firstTree.checkTraversal(firstTree.root,secondTree.root));
}

public boolean printCheckinOrderTraversal(Node node,List<Integer> list){
if(node == null){
return true;
}
if(!printCheckinOrderTraversal(node.left,list)){
  return false;
}
if(list.isEmpty() || (list.get(0) != node.data)){
return false;
}
list.remove(0);
return printCheckinOrderTraversal(node.right,list);
	}


public void printInOrderTraversal(Node node, List<Integer> list){
if(node == null){
return;
}
printInOrderTraversal(node.left,list);
list.add(node.data);
	printInOrderTraversal(node.right,list);
}

public boolean checkTraversal(Node firstRoot,Node secondRoot){
	if(firstRoot == null & secondRoot == null){
		return true;
	}

	if(firstRoot.left == null & secondRoot.right != null){
		return false;
	}else if(firstRoot.left != null & secondRoot.right == null){
		return false;
	}else if(checkTraversal(firstRoot.left, secondRoot.left)){
		return true;
	}else if(firstRoot.data == secondRoot.data){
		return true;
	}else{
return checkTraversal(firstRoot.right, secondRoot.right);
}

}

public void insertIntoTree(int data){
root = this.insert(root,data);
}

public Node insert(Node root,int data){
	if(root == null){
		return new Node(data);
}

	if(data > root.data){
root.left = insert(root.left, data);
}else if(data < root.data){
root.right = insert(root.right,data);
}
return root; 
}
}



