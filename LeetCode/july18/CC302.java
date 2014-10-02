package july18;

import java.util.Stack;

public class CC302 extends Stack<NodeWithMin>{
	public void push(int value){
		int newMin=Math.min(min(), value);
		super.push(new NodeWithMin(value,newMin));
	}

	private int min() {
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return peek().min;
		}
	}
	
}
