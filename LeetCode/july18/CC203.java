package july18;

public class CC203 {
	public boolean deleteNode(LinkedListNode node){
		if(node==null||node.next==null) return false;
		node.data=node.next.data;
		node.next=node.next.next;
		return true;
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
		boolean res=new CC203().deleteNode(h1);
		while(h1!=null){
			System.out.println(h1.data);
			h1=h1.next;
		}
	}

}
