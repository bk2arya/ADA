package datastructures.stack;


public class Stack<T> {

	private int top;
	private T[] stackArray;
	private int maxSize;
	private int bottom;
	
	public Stack() {
	}
	
	public Stack(int maxSize) {
		top=-1;
		this.maxSize=maxSize;
		this.stackArray = (T[]) new Object[this.maxSize];
	}
	
	public boolean isFull() {
		return top==maxSize-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(T value) {

		if(this.isFull()) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			this.stackArray[top] = value;
		}
	
	}
	
	public T pop() {

		
		if(this.isEmpty()) {
			System.out.println("Stack is empty");
			return (T) "EMPTY";
		}
		else {
			int oldTop = top;
			top--;
			return this.stackArray[oldTop];
		}
	
	}
	
	public T bottomElement() throws NullPointerException{
		if(isEmpty()) {
			return null;
		}
		else {
			return (T) stackArray[0];
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		String s = "Hello";
		Stack<Character> str = new Stack<Character>(s.length());
		
		for(int i=0;i<s.length();i++) {
			str.push(s.charAt(i));
		}
		
		while(!str.isEmpty()) {
			System.out.println(str.pop());
		}
	}
	
	
}
