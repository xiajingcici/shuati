package oct2;

import java.util.Stack;

public class EvalRPN {
	public int evalRPN(String[] tokens){
		if(tokens.length==1) return Integer.parseInt(tokens[0]);
		Stack<String> s=new Stack<String>();
		for(String t:tokens){
			if(t.matches("^-?[0-9]{1,}$")){
				s.push(t);
			}else{
				int o1=Integer.parseInt(s.pop());
				int o2=Integer.parseInt(s.pop());
				int temp=0;
				switch (t){
				case "+":
					temp=o1+o2; break;
				case "-": 
					temp=o2-o1; break;
				case "*":
					temp=o2*o1; break;
				case "/":
					temp=o2/o1; break;
				}
				s.push(Integer.toString(temp));
			}
		}		
		return Integer.parseInt(s.pop());
	}
	
	
	public static void main(String[] args) {
		String[] s={"3","-4","+"};
		EvalRPN e=new EvalRPN();
		int x=e.evalRPN(s);
		System.out.println(x);

	}

}
