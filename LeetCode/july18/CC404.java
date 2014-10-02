package july18;

import java.util.ArrayList;
import java.util.LinkedList;

public class CC404 {
	void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
		if(root==null) return;
		LinkedList<TreeNode> list=null;
		if(lists.size()==level){
			list=new LinkedList<TreeNode>();
			lists.add(list);
		}else{
			list=lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left,lists,level+1);
		createLevelLinkedList(root.right,lists,level+1);
	}
	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists=new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root,lists,0);
		return lists;
	}
	ArrayList<LinkedList<TreeNode>> createLevelLinkedList1(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current=new LinkedList<TreeNode>();
		if(root!=null) current.add(root);
		while(current.size()>0){
			result.add(current);
			LinkedList<TreeNode> parents=current;
			current=new LinkedList<TreeNode>();
			for(TreeNode parent:parents){
				if(parent.left!=null){
					current.add(parent.left);
				}
				if(parent.right!=null){
					current.add(parent.right);
				}
			}
		}
		return result;
	}
}
