package oct2;

import july18.ListNode;

public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int carry = 0;
        while(l1 != null || l2 != null) {
        	int a = l1 == null ? 0 : l1.val;
        	int b = l2 == null ? 0 : l2.val;
        	int c = (a+b+carry) % 10;
        	cur.next = new ListNode(c);
        	cur = cur.next;
        	carry = (a+b+carry) / 10;
        	if(l1 != null) l1 = l1.next;
        	if(l2 != null) l2 = l2.next;
        }
        if(carry != 0) cur.next = new ListNode(carry);
    	return result.next;
    }
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		l1.next=l2;
		l3.next=l4;
		AddTwoNum a=new AddTwoNum();
		ListNode res=a.addTwoNumbers(l1, l3);
		while(res!=null){
			System.out.println(res.val);
			res=res.next;
		}
	}

}
