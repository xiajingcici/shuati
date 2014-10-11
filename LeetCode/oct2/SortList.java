package oct2;

import july18.ListNode;

public class SortList {
	public ListNode sortList(ListNode head){
		if(head==null||head.next==null) return head;
		int count=0;
		ListNode p=head;
		while(p!=null){
			count++;
			p=p.next;
		}
		int mid=count/2;
		ListNode left=head, right=null;
		int countHalf=0;
		ListNode p2=head;
		
		while(p2!=null){
			countHalf++;
			ListNode next=p2.next;
			if(countHalf==mid){
				p2.next=null;
				right=next;
			}
			p2=next;
		}
		ListNode h1=sortList(left);
		ListNode h2=sortList(right);
		ListNode merged=merge(h1,h2);
		return merged;
	}
	
	
	private ListNode merge(ListNode left, ListNode right) {
		ListNode p1=left;
		ListNode p2=right;
		
		ListNode fakehead=new ListNode(-1);
		ListNode pNew=fakehead;
		
		while(p1!=null||p2!=null){
			if(p1==null){
				pNew.next=new ListNode(p2.val);
				p2=p2.next;
				pNew=pNew.next;
			}else if(p2==null){
				pNew.next=new ListNode(p1.val);
				p1=p1.next;
				pNew=pNew.next;
			}else{
				if(p1.val<p2.val){
					pNew.next=new ListNode(p1.val);
					p1=p1.next;
					pNew=pNew.next;
				}else if(p1.val==p2.val){
					pNew.next=new ListNode(p1.val);
					pNew.next.next=new ListNode(p2.val);
					pNew=pNew.next.next;
					p1=p1.next;
					p2=p2.next;
				}else{
					pNew.next=new ListNode(p2.val);
					p2=p2.next;
					pNew=pNew.next;
				}
			}
		}
		return fakehead.next;
	}


	public static void main(String[] args) {
		ListNode head=new ListNode(0);
		ListNode head1=new ListNode(5);
		ListNode head2=new ListNode(3);
		ListNode head3=new ListNode(4);
		ListNode head4=new ListNode(1);
		ListNode head5=new ListNode(2);
		head.next=head1;
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		SortList sl=new SortList();
		ListNode res=sl.sortList(head);
		while(res!=null){
			System.out.println(res.val);
			res=res.next;
		}
	}

}
