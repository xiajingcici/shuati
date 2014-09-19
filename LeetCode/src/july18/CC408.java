package july18;

public class CC408 {
//solution 1: add zero for null node, then order traversal get a string, and compare.
//matchTree compares two subtree to see if they are identical. search through the larger tree, call matchTree
	boolean matchTree(TreeNode r1, TreeNode r2){
		if(r2==null&&r1==null) return true;
		if(r1==null||r2==null) return false;
		if(r1.value!=r2.value) return false;
		return (matchTree(r1.left,r2.left)&&matchTree(r1.right,r2.right));
	}
	boolean containsTree(TreeNode t1,TreeNode t2){
		if(t2==null) return true;
		return subTree(t1,t2);
	}
	boolean subTree(TreeNode r1,TreeNode r2){
		if(r1==null) return false;
		if(r1.value==r2.value){
			if(matchTree(r1,r2)) return true;
		}
		return (subTree(r1.left,r2))||subTree(r1.right,r2);	
	}
}
