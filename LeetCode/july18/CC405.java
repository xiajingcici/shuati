package july18;

import java.util.ArrayList;

public class CC405 {
	public boolean checkBST(TreeNode root){
		boolean res=false;
		return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

	}
	public boolean checkBST(TreeNode root,int min,int max){
		if(root==null) return true;
		if(root.value<min||root.value>=max){
			return false;
		}
		if(!checkBST(root.left,min,root.value)||!checkBST(root.right,root.value,max)){;			
			return false;
		}
		return true;
	}
    public static void main(String args[]){
    	TreeNode t1=new TreeNode(2);
    	TreeNode t2=new TreeNode(1);
    	TreeNode t3=new TreeNode(2);
    	t1.left=t2;
    	t1.right=t3;

    	boolean res=new CC405().checkBST(t1);
    	System.out.println(res);
    }

}
