package july18;

public class CC202 {
	public LinkedListNode kthToLast(LinkedListNode head,int k){
		LinkedListNode fast=head, slow=head;
		
		for(int i=1;i<k;i++){
			if(fast==null) return null;
			fast=fast.next;
		}
		System.out.println(fast.data);
		if(fast==null) return null;
		while(fast.next!=null){
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		LinkedListNode h1=new LinkedListNode(1);
		LinkedListNode h2=new LinkedListNode(2);
		LinkedListNode h3=new LinkedListNode(3);
		LinkedListNode h4=new LinkedListNode(4);
		LinkedListNode h5=new LinkedListNode(5);
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;
		h4.next=h5;
		LinkedListNode res=new CC202().kthToLast(h1, 1);
		while(res!=null){
			System.out.println(res.data);
			res=res.next;
		}

	}

}
