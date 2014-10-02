package july18;

import java.util.Hashtable;

public class CC201 {
	//o(1) space, o(n^2) time
	public void removeDup(LinkedListNode head){
		if(head==null||head.next==null) return;
		LinkedListNode n1=head;
		while(n1!=null){
			LinkedListNode n2=n1;
			while(n2.next!=null){
				System.out.println(n1.data+"  n1:n2   "+n2.next.data);
				if(n1.data==n2.next.data){
					n2.next=n2.next.next;
				}else{
					n2=n2.next;
				}
			}
			n1=n1.next;
		}
	}
	//hashtable solution, o(n) time and space
	public void removeDup1(LinkedListNode head){
		if(head==null||head.next==null) return;
		Hashtable<Integer,Boolean> hash=new Hashtable<Integer,Boolean>();
		LinkedListNode pre=head;
		while(head!=null){
			if(hash.containsKey(head.data)){
				pre.next=head.next;
			}else{
				hash.put(head.data, true);
				pre=head;//assign current to pre before current updates to next
			}
			head=head.next;
		}
	}

	public static void main(String[] args) {
		LinkedListNode h1=new LinkedListNode(1);
		LinkedListNode h2=new LinkedListNode(2);
		LinkedListNode h3=new LinkedListNode(1);
		LinkedListNode h4=new LinkedListNode(3);
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;
		new CC201().removeDup1(h1);
		while(h1!=null){
			System.out.println(h1.data);
			h1=h1.next;
		}
		
	}

}
