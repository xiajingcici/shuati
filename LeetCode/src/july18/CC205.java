package july18;
public class CC205 {
	//reverse number 4-2-7 represents 724
	public LinkedListNode addList(LinkedListNode l1,LinkedListNode l2){		
		int carry=0;
		LinkedListNode pre=new LinkedListNode(0);
		LinkedListNode l=pre;
		while(l1!=null||l2!=null){
			int sum=0;
			if(l1!=null){
				sum+=l1.data;
				l1=l1.next;
			}
			if(l2!=null){
				sum+=l2.data;
				l2=l2.next;
			}
			sum+=carry;
			carry=sum/10;
			pre.next=new LinkedListNode(sum%10);
			pre=pre.next;
		}
		if(carry>0) pre.next=new LinkedListNode(carry);
		return l.next;
	}
	//normal order 4-2-7 represents 427, it's more complicated
	public LinkedListNode addList2(LinkedListNode l1,LinkedListNode l2){
		l1=reverse(l1);		
		l2=reverse(l2);
		LinkedListNode res=addList(l1,l2);
		res=reverse(res);
		return res;
	}
	public static LinkedListNode reverse(LinkedListNode l1){
		if(l1==null||l1.next==null) return l1;
		LinkedListNode res=null;
		LinkedListNode cur=l1;
		while(cur!=null){
			LinkedListNode temp=cur.next;//store next value for the loop
			cur.next=res;//append res to current node
			res=cur;//update res
			cur=temp;			//update cur
		}
		return res;
	}
//	//normal order 4-2-7 represents 427, it's more complicated
//	public LinkedListNode addList1(LinkedListNode l1,LinkedListNode l2){		
//		int len1=length(l1),len2=length(l2);
//		if(len1>len2) l2=padList(l2,len1-len2);
//		if(len1<len2) l1=padList(l1,len2-len1);
//		LinkedListNode newHead=addLast(l1,l2);
//		int carry=newHead.data/10;
//		if(carry>0){
//			LinkedListNode temp=new LinkedListNode(newHead.data%10);
//			temp.next=newHead.next;
//			newHead=new LinkedListNode(carry);
//			newHead.next=temp;
//		}
//		return newHead;
//	}
//	//helper function1: length
//	public int length(LinkedListNode l){
//		int len=0;
//		while(l!=null){
//			len++;
//			l=l.next;
//		}
//		return len;
//	}
//	//helper function2: add zero to short list
//	public LinkedListNode padList(LinkedListNode l,int k){
//		LinkedListNode res=new LinkedListNode(0);
//		LinkedListNode last=res;
//		for(int i=1;i<k;i++){
//			LinkedListNode zero=new LinkedListNode(0);
//			last.next=zero;
//			last=zero;
//		}
//		last.next=l;
//		return res;
//	}
//	//helper function3: 
//	public LinkedListNode addLast(LinkedListNode l1,LinkedListNode l2){
//		if(l1==null||l2==null) return null;
//		LinkedListNode node=addLast(l1.next,l2.next);
//		int carry=0;
//		if(node!=null){
//			carry=node.data/10;
//			node.data%=10;
//		}
//		int sum=l1.data+l1.data+carry;
//		LinkedListNode curNode=new LinkedListNode(sum);
//		curNode.next=node;
//		return curNode;			
//	}


	public static void main(String args[]){
		LinkedListNode h1=new LinkedListNode(1);
		LinkedListNode h2=new LinkedListNode(5);
		LinkedListNode h3=new LinkedListNode(3);
		LinkedListNode h4=new LinkedListNode(9);
		LinkedListNode h5=new LinkedListNode(2);
		LinkedListNode h6=new LinkedListNode(8);
		h1.next=h2;
		h2.next=h3;
//		h3.next=h4;
		h4.next=h5;
		h5.next=h6;
		CC205 c=new CC205();
		LinkedListNode res=c.addList2(h1,h4);
		while(res!=null){
			System.out.println("result="+res.data);
			res=res.next;
		}

	}
}
