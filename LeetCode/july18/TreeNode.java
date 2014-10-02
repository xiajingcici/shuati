package july18;

public class TreeNode {
	int value;
	TreeNode right;
	TreeNode left;
	public TreeNode next;

	TreeNode(int a){
		value=a;
	}
	TreeNode parent(TreeNode root,TreeNode n){
		TreeNode lh=null,rh=null;
		if(null==root) return null;
		if(root.left==n||root.right==n) return root;
		lh=parent(root.left,n);
		rh=parent(root.right,n);
		return lh!=null?lh:rh;
	}

}
	
