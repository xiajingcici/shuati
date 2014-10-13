package oct2;

public class PopulateNextRight2 {
    public void connect(TreeLinkNode root) {
    	if(root==null) return;
    	TreeLinkNode start=root;
    	//construct next level and populate
    	while(start!=null){
    		TreeLinkNode p=start;
    		start=null;
    		while(p!=null){
    			if(p.left!=null){
    				start=p.left;
    				break;
    			}
    			if(p.right!=null){
    				start=p.right;
    				break;
    			}
    			p=p.next;
    		}
    		TreeLinkNode pre=null;
    		while(p!=null){
    			if(p.left!=null){
    				if(pre!=null){
    					pre.next=p.left;
    				}
    				pre=p.left;
    			}
    			if(p.right!=null){
    				if(pre!=null){
    					pre.next=p.right;
    				}
    				pre=p.right;
    			}
    			p=p.next;
    		}
    	}
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
