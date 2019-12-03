/*
*simple tree declaration. 
*/
public class Tree {

Node root;

public Tree(){
this.root = null;    
}

/*
*Node declaration. 
*/
public class Node{
int value;
Node left;
Node right;

Node(int a){
  this.value =a;
  this.left = null;
  this.right = null;
}
 
}


  public static void main(String[] args) {
      Tree tree = new Tree();
   // System.out.println("Node value: "+tree.root.value);
    tree.insertIntoTree(2);
    tree.insertIntoTree(1);
    tree.insertIntoTree(4);
    tree.insertIntoTree(7);
  
   System.out.println("In Order Traversal.");
    tree.inOrderTraversal(tree.root);
    
   System.out.println("Pre Order Traversal.");
     tree.preOrderTraversal(tree.root);
     
   System.out.println("Post Order Traversal.");
      tree.postOrderTraversal(tree.root);
  }
  
  public void insertIntoTree(int value){
   root = insert(root,value);   
  }
  
  public Node insert(Node root,int value) {
      if(root == null){
          Node newNode = new Node(value);
          return newNode;
      }
      
      if(root.value > value){
        root.left =  insert(root.left,value);
      }else{
          root.right = insert(root.right,value);
      }
      return root;
      
  }
  
  
  public void inOrderTraversal(Node root){
      if(root == null){
          return;
      }
      
          inOrderTraversal(root.left);
          System.out.println(root.value);
          inOrderTraversal(root.right);
      
      
  }
  
  public void preOrderTraversal(Node root){
      if(root == null){
          return;
      }
       System.out.println(root.value);
          inOrderTraversal(root.left);
         
          inOrderTraversal(root.right);
      
      
  }
  
  public void postOrderTraversal(Node root){
      if(root == null){
          return;
      }
      
          inOrderTraversal(root.left);
         
          inOrderTraversal(root.right);
           System.out.println(root.value);
      
      
  }
  
}