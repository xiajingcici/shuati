package oct2;


import java.util.ArrayList;
import java.util.List;

import july18.ListNode;
import july18.TreeNode;

public class ConvertListToBST {
	static ListNode h;
	 
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) return null;
		h=head;
		int len=getLength(head);
		return sortedListToBST(0,len-1);
	}


 
	private TreeNode sortedListToBST(int start, int end) {
		if(start>end) return null;
		int mid=(start+end)/2;
		TreeNode left=sortedListToBST(start,mid-1);
		TreeNode root=new TreeNode(h.val);	
		h=h.next;
		TreeNode right=sortedListToBST(mid+1,end);
		root.left=left;
		root.right=right;
		return root;
	}



	private int getLength(ListNode head) {
		int l=0;
		ListNode temp=head;
		while(temp!=null){
			temp=temp.next;
			l++;
		}
		return l;
	}
	static void print(TreeNode root){
		if(root==null) return;
		if(root!=null){
			print(root.left);
			System.out.println(root.val);
			print(root.right);
		}
	}


public TreeNode sortedListToBST1(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode node = head;
        while(node!=null){
            list.add(node.val);
            node = node.next;
        }
        return sortedListToBST(list, 0, list.size()-1);
    }
    public TreeNode sortedListToBST(List<Integer> list, int start, int end) {
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = sortedListToBST(list, start, mid-1);
        node.right = sortedListToBST(list, mid+1, end);
        return node; 
    }

	public static void main(String args[]){
		ConvertListToBST cl = new ConvertListToBST();
		ListNode head=new ListNode(0);
		ListNode head1=new ListNode(1);
		ListNode head2=new ListNode(2);
		ListNode head3=new ListNode(3);
		ListNode head4=new ListNode(4);
		ListNode head5=new ListNode(5);
		head.next=head1;
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		TreeNode root=cl.sortedListToBST(head);
		print(root);
	}
}
