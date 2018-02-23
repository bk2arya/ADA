package datastructures.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Node {

	 int data;
	 Node address;
	
	Node(){
		this.address=null;
	}
	
	Node(int data){
		this();
		this.data=data;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		LinkedList linkedList = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		
		
		Node n1 = linkedList.head;
		
		try {
		for(int i=10;i<=50;i=i+10) {
			//1.
			linkedList.insert(i);
			linkedList2.insert(i);
		}
		
		//2.
		linkedList.printLinkedList();
		//linkedList.swapNodes(1, 2);
		//linkedList.deleteFirstOccurance(0);
		
		System.out.println("New Linked List\n");
		//linkedList.insertAt(2, 6);
		//linkedList.deleteAtFront(3);
		//linkedList.deleteAtRear(6);
		//linkedList.reverseList();
		
		//linkedList.mergeList(linkedList2);
		System.out.println("shift\n");
		linkedList.shiftLeft(157,"ll");//(linkedList2);
		linkedList.printLinkedList();
		
		System.out.println("rotate\n");
		linkedList.printLinkedList();
		
		System.out.println("Length --> "+linkedList.length());
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}

