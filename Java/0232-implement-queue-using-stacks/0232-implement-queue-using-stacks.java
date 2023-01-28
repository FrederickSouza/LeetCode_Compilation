class MyQueue {
	Stack<Integer> pilhaA;
	Stack<Integer> pilhaB;
	
	public MyQueue() {
		pilhaA = new Stack<Integer>();
		pilhaB = new Stack<Integer>();
	}
	
	public void push(int x) {
		pilhaA.push(x);
	}
	
	public int pop() {
		
		if(pilhaB.empty()) {
			while(!pilhaA.empty()) {
				pilhaB.push(pilhaA.pop());
			}
		}
		return pilhaB.pop();
	}
	
	public int peek() {
		
		if(pilhaB.empty()) {
			while(!pilhaA.empty()) {
				pilhaB.push(pilhaA.pop());
			}
		}
		return pilhaB.peek();
	}
	
	public boolean empty() {
		
		if(pilhaA.empty() && pilhaB.empty()) {
			return true;
		} else {
			return false;
		}
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */