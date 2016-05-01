package easy;
import java.util.Stack;

class MinStack {
	Stack<Integer> list;
	Stack<Integer> minList;

	public MinStack() {
		list = new Stack<Integer>();
		minList = new Stack<Integer>();
	}

	public void push(int x) {
		list.push(x);
		if (minList.isEmpty() || x < this.getMin()) {
			minList.push(x);
		} else {
			minList.push(this.getMin());
		}
	}

	public void pop() {
		if (!list.isEmpty())
			list.pop();
		if (!minList.isEmpty())
			minList.pop();
	}

	public int top() {
		if (list.isEmpty())
			return 0;
		else
			return list.peek();
	}

	public int getMin() {
		if (minList.isEmpty())
			return 0;
		else
			return minList.peek();
	}
}