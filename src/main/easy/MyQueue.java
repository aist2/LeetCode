package easy;
import java.util.Stack;

class MyQueue {
	Stack<Integer> input;
	Stack<Integer> output;
	
	public MyQueue(){
		input = new Stack<Integer>();
		output = new Stack<Integer>();
	}
	
	public void push(int x) {
		input.push(x);
	}
	
	public void pop() {
		peek();
		output.pop();
	}
	
	public int peek(){
		if (output.isEmpty()) {
			while (!input.isEmpty()) {
				output.push(input.pop());
			}
		}
		return output.peek();
	}
	
	public boolean empty() {
		return input.isEmpty() && output.isEmpty();
	}
}

/*
class MyQueue {
	Stack<Integer> s;
	
	public MyQueue() {
		s = new Stack<Integer>();
	}
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> tmpS = new Stack<Integer>();
        while (!s.isEmpty()){
        	tmpS.push(s.pop());
        }
        s.push(x);
        while (!tmpS.isEmpty()){
        	s.push(tmpS.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        s.pop();
    }

    // Get the front element.
    public int peek() {
        return s.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.isEmpty();
    }
}
*/