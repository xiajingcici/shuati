package july18;

import java.util.Stack;

public class CC207 {
	public boolean isPalindrome(LinkedListNode l){
		LinkedListNode fast=l, slow=l;
		Stack<Integer> s=new Stack<Integer>();
		while(fast!=null&&fast.next!=null){
			s.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null){
			slow=slow.next;
		}
		while(slow!=null){
			int top=s.pop().intValue();
			if(top!=slow.data){
				return false;
			}
			slow=slow.next;
		}
		return true;
	}
	public static void main(String[] args) {
		LinkedListNode h1=new LinkedListNode(1);
		LinkedListNode h2=new LinkedListNode(5);
		LinkedListNode h3=new LinkedListNode(3);
		LinkedListNode h4=new LinkedListNode(9);
		LinkedListNode h5=new LinkedListNode(2);
		LinkedListNode h6=new LinkedListNode(8);
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;
		h4.next=h5;
		h5.next=h6;
		h6.next=h3;
		CC205 c=new CC205();
		LinkedListNode res=new CC206().findBegin(h1);
//		while(res!=null){
//			System.out.println(res.data);
//			res=res.next;
//		}
		System.out.println(res.data);
	}
}
