package july18;

public class CC204 {
	public LinkedListNode partition(LinkedListNode head,int x){
		LinkedListNode ll=null,l =null,r=null,rr=null;
		while(head!=null){
			LinkedListNode next=head.next;
			head.next=null;
			if(head.data<x){
				if(ll==null){
					ll=head;
					l=ll;					
				}else{
					l.next=head;
					l=head;
				}
			}else{
				if(r==null){
					r=head;
					rr=r;
				}else{
					rr.next=head;
					rr=head;
				}
			}
			head=next;
		}
		if(ll==null) return l;
		l.next=r;
		return ll;
	}
	public LinkedListNode partition1(LinkedListNode node,int x){
		LinkedListNode left=null,right=null;
		while(node!=null){
			LinkedListNode next=node.next;
			if(node.data<x){
				node.next=left;
				left=node;
			}else{
				node.next=right;
				right=node;
			}			
			node=next;
		}
		if(left==null) return right;
		LinkedListNode start=left;	
		while(left.next!=null){
			left=left.next;
		}
		left.next=right;
		return start;
		
	}
	public static void main(String[] args) {
		LinkedListNode h1=new LinkedListNode(1);
		LinkedListNode h2=new LinkedListNode(5);
		LinkedListNode h3=new LinkedListNode(3);
		LinkedListNode h4=new LinkedListNode(9);
		LinkedListNode h5=new LinkedListNode(2);
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;
		h4.next=h5;
		LinkedListNode res=new CC204().partition1(h1, 4);
		while(res!=null){
			System.out.println(res.data);
			res=res.next;
		}
	}

}
