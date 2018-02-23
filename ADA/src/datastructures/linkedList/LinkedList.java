package datastructures.linkedList;

public class LinkedList {
	

	Node head;
	Node n1;
	
//create a linked list. insert elements at the back	
public void insert(int data) {
		
		if(head == null) {
			head = new Node(data);
			n1=head;
		}
		else {
			n1.address = new Node(data);
			n1=n1.address;
		}

	}

public void insertAt(int index, int data) {
	
	Node temp =head, prev=null;
	
	if(index > length()-1) {
		System.out.println("not possible");
		return;
	}
	
	if(temp==null) {
		temp = new Node(data);
		head=temp;
		return;
	}
	
	for(int i=0; temp!=null && i<index;i++) {
		temp=temp.address;
	}
	
	Node n= new Node(data);

	prev = temp.address;
	temp.address = n;
	n.address = prev;
	
	//or
	/*Node new_node= new Node(data);
	new_node.address = head;
	head = new_node;*/
}

//Print a Linked List
public void printLinkedList() {
	
	Node n=head;
	while(n !=null) {
		System.out.println(n.data);
		n=n.address;
		
	}

}

//Insert between when a Node reference is given
public void insertBetween(Node prev_node, int data) {
	
	if(prev_node == null) {
		System.out.println("cant be null");
	}
	Node new_node= new Node(data);
	new_node.address = prev_node.address;
	prev_node.address = new_node;
	
}

//Insert a new Node at the end
public void insertAtEnd(int data) {
	
	
	Node new_node= new Node(data);
	Node last=head;
	while(last.address!=null) {
		last=last.address;
	}
	last.address = new_node;
	
}

//Insert a new Node at the begining
public void insertAtFront(int data) {
	
	if(head == null) {
	head = new Node(data);
	return;
	}
	else {
	Node new_node= new Node(data);
	new_node.address = head;
	head = new_node;
	}
}

//delete first occurance of the data
public void deleteFirstOccurance(int data) {

	Node temp = head, prev = null;
	
	if(temp == null) {
		return;
	}
	else if(temp!=null && temp.data==data) {
		head=temp.address;
		return;
	}
	
	while(temp!=null && temp.data!=data) {
		prev = temp;
		temp = temp.address;
	}
	
	prev.address = temp.address;
	
}

//Swapping nodes of a Linked List without swapping the data
public void swapNodes(int data1, int data2) {
	
	if(data1==data2) return;
	
	
	Node temp1=head,prev1=null; 
	while(temp1!=null && temp1.data!=data1) {
		prev1=temp1;
		temp1=temp1.address;
	}
	
	Node temp2=head, prev2=null;
	while(temp2!=null && temp2.data!=data2) {
		prev2=temp2;
		temp2=temp2.address;
	}
	
	//check for x if head
	if(prev1!=null) {
		prev1.address = temp2;
	}
	else {
		head=temp2;
	}
if(prev2!=null) {
		prev2.address=temp1;
	}
	else {
		head=temp1;
	}
	
Node temp = temp2.address;
temp2.address = temp1.address;
temp1.address =temp;

}

//Finding length of a Linked List
public int length() {
	
	Node n =head;
	int count = 0;
	while(n!=null) {
		count++;
		n= n.address;
	}
	
	return count;
}

//delete from front end based on the noOf elements to be deleted at front
//Also used for QUEUE delete operation using Linked List
public void deleteAtFront(int noOfelements) {
	
	Node n =head;
	
	if(noOfelements > length()) return;
	else if(noOfelements == length()) {
		head = null;
		return;
	}
	else if(noOfelements == 0) {
		return;
	}
	else {
		
		for(int i=0; n!=null && i < noOfelements; i++) {
			n=n.address;
		}
		head=n;
	}
}

//delete from front end based on the noOf elements to be deleted at front
//Also used for STACK delete operation using Linked List
public void deleteAtRear(int noOfelements) {
	
	Node n =head;
	
	if(noOfelements > length()) return;
	else if(noOfelements == length()) {
		head = null;
		return;
	}
	else if(noOfelements == 0) {
		return;
	}
	else {
		int len = (length()-noOfelements)-1;
		for(int i=0; n!=null && i <len ; i++) {
			n=n.address;
		}
		n.address=null;
	}
}

public void reverseList() {
	
	Node prev = null, next = null;
	Node curr = head;
	
	while(curr!=null) {
		next = curr.address;
		curr.address=prev;
		prev=curr;
		curr=next;
	}
	head=prev;
}

//Merge a given list with the existing list.
public void mergeList(LinkedList listToBeMerged) {
	
	Node temp = head;
	
	if(temp == null || listToBeMerged.head == null) {
		return;
	}

	while(temp.address!=null) {
		temp=temp.address;
	}
	temp.address = listToBeMerged.head;
}

public void shiftLeft(int noOfShifts, String direction) {
	
	Node temp = head, prev=null, last=head;
	
	int mod= noOfShifts%length();
	
	if(mod==0) return;
	
	if(direction.equalsIgnoreCase("r")) {
		mod=length()-mod;
	}else if(!direction.equalsIgnoreCase("l")) {
		return;
	}
	
	if(temp==null || temp.address ==null) return;
	

	while(last.address!=null) {
		last=last.address;
	}
	
		
	for(int i=0;i<mod;i++) {
			
			if(temp.address!=null) {
			prev=temp;
			temp=temp.address;
			}
			else {
				prev=null;
				temp=head;
			}
		}
		
	if(prev!=null) {
		last.address = head;
		prev.address = null;
		head=temp;
		}
	
}


}
