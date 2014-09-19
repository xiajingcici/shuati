package july18;

import java.util.ArrayList;
import java.util.Stack;

public class CC303 {
	ArrayList<Stack> stacks=new ArrayList<Stack>();
	public int capacity;
	
	public void push(int v){
		Stack last=getLastStack();

		if(last!=null&&last.size()<capacity){		//last is not full
			last.push(v);
		}else{
			Stack s=new Stack();
			s.push(v);
			stacks.add(s);
		}
	}
	public int pop(){
		Stack last=getLastStack();
		int v=(int) last.pop();
		if(last.size()==0) stacks.remove(stacks.size()-1);
		return v;
	}
	public Stack getLastStack(){
		if(stacks.size()==0){
			return null;
		}else{
			return stacks.get(stacks.size()-1);
		}
	}
}
