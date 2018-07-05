package datastructures.circularLinkedList;

public class CircularLinkedList<T> {

	Node<T> head;
	Node<T> last;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	//insert at Rear
public void insert(T data) {
		
	if(isEmpty()) {
		head = new Node<T>(data);
		last=head;
		last.address = head;
	}
	else {
		Node n = new Node(data);
		last.address = n;
		last=n;
		last.address = head;
	}
	}

public void insertFront(T data) {
	if(isEmpty()) {
		head = new Node<T>(data);
		last=head;
		last.address = head;
	}
	else {
		Node n = new Node(data);
		n.address = head;
		head = n;
		last.address=head;
		
	}
}
	//delete
	//print
public void print() {
	
	Node curr = head;
	do {
		System.out.println(curr.data);
		curr=curr.address;
	}
	while(curr!=head);
		
}
	
public static void main(String[] args) {
	
	CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
	for(int i=0;i<5;i++) {
		list.insert(i);
	}
	
	list.insertFront(5);
	list.print();
}

}

class Node<T>{
	
	T data;
	Node<T> address;
	
	Node(){
		
	}
	
	Node(T data){
		this.data=data;
		this.address = null;
	}
	
}