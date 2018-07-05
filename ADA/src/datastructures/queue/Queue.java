package datastructures.queue;

public class Queue<T> {

	private int maxSize;
	private T[] queueArray;
	private int front;
	private int rear;
	
	public Queue(){
	}
	
	public Queue(int maxSize){
		this.maxSize = maxSize;
		front=0;
		rear = -1;
		queueArray = (T[]) new Object[maxSize];
	}
	
	public boolean isFull() {
		return rear==maxSize-1;
	}
	
	public boolean isEmpty() {
		return (rear==-1 || front==-rear);
	}
	
	public void insert(T data) {
		
		if(isFull()) {
			System.out.println("No entry in the Queue");
		}
		else {
			rear++;
			queueArray[rear] = data;
		}
	}
	
	public T remove() throws NullPointerException{
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			return null;
		}
		else {
			int oldFront = front;
			front++;
			return queueArray[oldFront];
		}
	}
	
	public int size() {
		return rear==-1 ? 0: rear+1;
	}
	
	public void  s() {
	}
	
	
	public static void main(String[] args) {
		
		String s = "Hello";
		Queue<Character> queue = new Queue<Character>(6);
		for(int i=0;i<s.length();i++) {
			queue.insert(s.charAt(i));
		}

		System.out.println(queue.size());
		
		//System.out.println(queue.s()); 	print or println can have a method which returns something
		
		try {
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		}
		catch(Exception ex) {
			System.out.println("No data to remove");
		}
	}
}
