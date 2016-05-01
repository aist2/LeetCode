package easy;
import java.util.LinkedList;
import java.util.Queue;


class MyStack {
	Queue<Integer> q;
	public MyStack(){
		q = new LinkedList<Integer>();
	}
	// Push element x onto stack.
	public void push(int x) {
		q.add(x);
		for (int i=0;i<q.size()-1;i++){
			q.add(q.poll());
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		q.poll();
	}

	// Get the top element.
	public int top() {
		return q.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q.isEmpty();
	}
}

/*
class MyStack {
	Queue<Integer> q1;
	Queue<Integer> q2;
	public MyStack(){
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}
	// Push element x onto stack.
	public void push(int x) {
		if (q2.isEmpty()) {
			q1.add(x);
		}
		else {
			q2.add(x);
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		int val;
		if (q2.isEmpty()) {
			while (!q1.isEmpty()) { 
				val = q1.poll();
				if (!q1.isEmpty()) q2.add(val);
			}
		} else if (q1.isEmpty()) {
			while (!q2.isEmpty()) { 
				val = q2.poll();
				if (!q2.isEmpty()) q1.add(val);
			}
		}
	}

	// Get the top element.
	public int top() {
		int val=0;
		if (q2.isEmpty()) {
			while (!q1.isEmpty()) { 
				val = q1.poll();
				q2.add(val);
			}
			
		} else if (q1.isEmpty()) {
			while (!q2.isEmpty()) { 
				val = q2.poll();
				q1.add(val);
			}
		}
		return val;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return (q1.isEmpty() && q2.isEmpty());
	}
}
*/