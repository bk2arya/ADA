package datastructures.trees;

//tree node
public class Node {

	int data;
	Node leftChild;
	Node rightChild;
	
	Node(){
		this.leftChild = null;
		this.rightChild = null;
	}
	
	Node(int data){
		this();
		this.data = data;
	}
	
	
}


