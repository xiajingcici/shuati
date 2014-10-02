package july18;

import java.util.Stack;

//implement myqueue class using two stacks
public class MyQueue {
	Stack<T> stackN, stackO;
	public MyQueue(){
		stackN=new Stack<T>();
		stackO=new Stack<T>();
	}
	public int size(){
		return stackN.size()+stackO.size();
	}
	public void add(T value){
		stackN.push(value);
	}
	private void shiftStacks(){
		if(stackO.isEmpty()){
			while(!stackN.isEmpty()){
				stackO.push(stackN.pop());
			}
		}
	}
	public T peek(){
		shiftStacks();
		return stackO.peek();
	}
	public T remove(){
		shiftStacks();
		return stackO.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
