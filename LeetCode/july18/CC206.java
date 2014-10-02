package july18;

public class CC206 {
	public LinkedListNode findBegin(LinkedListNode l){
		if(l==null||l.next==null) return null;
		LinkedListNode slow=l, fast=l;
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) break;
		}
		if(fast==null||fast.next==null) return null;
		fast=l;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
			
		}
		return fast;
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
