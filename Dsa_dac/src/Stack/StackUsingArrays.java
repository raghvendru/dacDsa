package Stack;

public class StackUsingArrays {
	int top  ;//means stack is empty
	int capacity ;
	int[] arr;
	
	public StackUsingArrays(int capacity1) {
		top = -1;
		capacity = capacity1;
		arr = new int[capacity]; 
	}
	
	public void push(int item) {
		//check available space in stack
		if(isFull()) {
			System.out.println("Stack over flow");
			return;
		}
		arr[++top] = item;
	}
	
	public boolean isFull() {
		return (top == capacity-1);
	}
	
	public void pop() {
		//check elements are there
		if(isEmpty()) {
			System.out.println("Oops!! no elements in the stack");
			return;
		}
		top--;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Oops!! no elements in the stack");
			return;
		}
		System.out.println("peeking element:"+arr[top]);

	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	public static void main(String[] args) {
		StackUsingArrays s = new StackUsingArrays(5);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.pop();
		s.peek();
		
		
	}

}
