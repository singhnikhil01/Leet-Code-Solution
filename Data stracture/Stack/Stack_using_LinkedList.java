package Stack;
import static java.lang.System.exit;

// Create Stack Using Linked list
class Stack_using_LinkedList{
    Node top;

	private class Node {

		int data; 
		Node link; 
	}
	
	Stack_using_LinkedList()
	{
		this.top = null;
	}

	public void push(int data) // insert at the beginning
	{
		Node node  = new Node();

		if (node == null) {
			System.out.print("\nHeap Overflow");
			return;
		}

	    node.data = data;
		node.link = top;

		// update top reference
		top = node;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty()
	{
		return top == null;
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		top = (top).link;
	}

	public void display()
	{
		// check for stack underflow
		if (top == null) {
			System.out.println("\nStack Underflow");
			exit(1);
		}
		else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.printf("%d  ", temp.data);

				// assign temp link to temp
				temp = temp.link;
			}
		}
	}
}