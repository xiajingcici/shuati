package july18;

public class CC401 {
	public int getHeight(TreeNode root){
		if(root==null) return 0;
		int res=1+Math.max(getHeight(root.left), getHeight(root.right));
		return res;
	}
	public boolean isBalanced(TreeNode root){
		if(root==null||root.left==null||root.right==null) return true;
		int dif=getHeight(root.left)-getHeight(root.right);
		if(Math.abs(dif)>1) return false;
		else return isBalanced(root.left)&&isBalanced(root.right);
	}
	public int checkHeight(TreeNode root){
		if(root==null||root.left==null||root.right==null) return 0;
		int leftHeight=checkHeight(root.left);
		if(leftHeight==-1) return -1;
		int rightHeight=checkHeight(root.right);
		if(rightHeight==-1) return -1;
		int dif=leftHeight-rightHeight;
		if(Math.abs(dif)>1) return -1;
		else return 1+Math.max(leftHeight, rightHeight);	
	}
	public boolean isBalanced1(TreeNode root){
		if(checkHeight(root)==-1) return false;
		else return true;
	}
}
