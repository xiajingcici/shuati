package july18;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointers {
    public void connect(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        TreeNode just_passed=null;
        int count=0;
        int degree=0;
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(count>=Math.pow(2,degree)){
                count=0;
                degree+=1;
            }
            if(count!=0){
                just_passed.next=cur;
            }
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
            just_passed=cur;
            count++;
        }
    }
}
