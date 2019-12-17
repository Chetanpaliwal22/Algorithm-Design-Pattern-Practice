package com.concordia.algo;

//input two tree
//output true false
//constraint one level difference is balanced

//step
//define tree
//define node
//get level of each node’s left hand and right hand and check if two are the same or not

import java.lang.Math;

public class BalanceTree{

	Node root; 

	public BalanceTree(){
		this.root = null;
	}

	class Node{
		Node left,right;
		int value;

		public Node(int value){
			this.left=this.right= null;
			this.value = value;
}
}

public static void main(String[] args){
	BalanceTree tree = new BalanceTree();

tree.insertIntoTree(3);
tree.insertIntoTree(8);
tree.insertIntoTree(19);
tree.insertIntoTree(20);
tree.insertIntoTree(2);
tree.insertIntoTree(1);
tree.insertIntoTree(7);
tree.insertIntoTree(18);
//tree.insertIntoTree(22);

System.out.println(tree.checkBalanced(tree.root));
}

public boolean checkBalanced(Node node){
  if(node == null){
      return true;
  }
	int leftHeight = height(node.left);
	int rightHeight = height(node.right);
if((Math.abs(leftHeight - rightHeight) <=1) & checkBalanced(node.left) & checkBalanced(node.right)) {
return true;
}else{
return false;
}
}

public int height(Node node){
if(node == null){
return 0;
}

return 1+Math.max(height(node.left),height(node.right));
}

public int check(Node root,int level){
if(root == null){
return level;
}
int leftLevel = check(root.left, level++);
int rightLevel = check(root.right, level++);
if((leftLevel - rightLevel) == 1 || (rightLevel - leftLevel == 1) || (leftLevel - rightLevel ==0)){
return 1;
}
return 0;
} 

public void insertIntoTree(int value){
root = insert(root, value);
}

public Node insert(Node node, int value){
if(node == null){
return new Node(value);
}

if(value > node.value){
node.right = insert(node.right,value);
}else if(value < node.value){
node.left =insert(node.left,value);
}
return node;
}
}




