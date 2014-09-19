package july18;

public class CC407 {
	//optimal solution
	Result commonAncestorHelper(TreeNode root,TreeNode p,TreeNode q){
		if(root==null) return new Result(null,false);
		if(root==p&&root==q) return new Result(root,true);
		Result rx=commonAncestorHelper(root.left,p,q);
		if(rx.isAncestor){
			return rx;
		}
		Result ry=commonAncestorHelper(root.right,p,q);
		if(ry.isAncestor){
			return ry;
		}
		if(rx.node!=null&&ry.node!=null){
			return new Result(root,true);
		}else if(root==p||root==q){
			boolean isAncestor=rx.node!=null||ry.node!=null?true:false;
			return new Result(root,isAncestor);
		}else{
			return new Result(rx.node!=null?rx.node:ry.node,false);
		}
	}	
	TreeNode commonAncestor(TreeNode root,TreeNode p,TreeNode q){
		Result r=commonAncestorHelper(root,p,q);
		if(r.isAncestor){
			return r.node;
		}
		return null;
	}
	//bad solution
	public boolean covers(TreeNode root,TreeNode p){
		if(root==null) return false;
		if(root==p) return true;
		return covers(root.left,p)||covers(root.right,p);
	}
	TreeNode commonAncestorHelper1(TreeNode root,TreeNode p,TreeNode q){
		boolean is_p_on_left=covers(root.left,p);
		boolean is_q_on_left=covers(root.left,q);
		if(is_p_on_left!=is_p_on_left) return root;
		TreeNode child_side=is_p_on_left?root.left:root.right;
		return commonAncestorHelper1(child_side,p,q);	
	}
	TreeNode commonAncestor1(TreeNode root,TreeNode p,TreeNode q){
		if(!covers(root,p)||!covers(root,q)) return null;
		return commonAncestorHelper1(root,p,q);
	}
}
