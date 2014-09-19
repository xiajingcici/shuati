package july18;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    	if(root==null) return result;
//rList represents parent TreeNode list, rValList represents parents value list;
    	ArrayList<TreeNode> rList=new ArrayList<TreeNode>();   	
    	ArrayList<Integer> rvalList=new ArrayList<Integer>();
    	rList.add(root);
    	rvalList.add(root.value);
    	while(rList.size()>0){
        	result.add(0,rvalList);
    		//children list
    		ArrayList<TreeNode> cList=new ArrayList<TreeNode>();
        	ArrayList<Integer> cvalList=new ArrayList<Integer>();  
        	for(TreeNode r:rList){
        		if(r.left!=null){
        			cList.add(r.left);
        			cvalList.add(r.left.value);
        		}
        		if(r.right!=null){
        			cList.add(r.right);
        			cvalList.add(r.right.value);
        		}
        	}
        	rList=new ArrayList<TreeNode>(cList);
        	rvalList=new ArrayList<Integer>(cvalList);
    	}
    	return result;
    }
    public static void main(String args[]){
    	TreeNode t1=new TreeNode(1);
    	TreeNode t2=new TreeNode(2);
    	TreeNode t3=new TreeNode(3);
    	TreeNode t4=new TreeNode(4);
    	TreeNode t5=new TreeNode(5);
    	t1.left=t2;
    	t1.right=t3;
    	t3.left=t4;
    	t3.right=t5;
    	
    	ArrayList<ArrayList<Integer>> res=new LevelOrder().levelOrder(t1);
    	System.out.println(res);
    }
}
