package cc150;

public class SwapInPlace {
	void swap(int x,int y){
		x=x-y;
		y=x+y;
		x=y-x;
	}
	void swapByXor(int x,int y){
		x=x^y;
		y=x^y;
		x=x^y;
	}

	public static void main(String args[]){
		SwapInPlace sip=new SwapInPlace();
		int x=5,y=1;
		sip.swap(x, y);
		System.out.println("x="+x+" y="+y);
	}
}
