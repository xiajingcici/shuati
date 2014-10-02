package july18;

public class CC409 {
	public static void print(int[] path,int start,int end){
		System.out.println("print function");
		for(int i=start;i<=end;i++){
			System.out.println(path[i]+" ");
		}
		System.out.println();
	}
	public int depth(TreeNode node){
		System.out.println("depth function");
		if(node==null) return 0;
		else return 1+Math.max(depth(node.left),depth(node.right));
	}
	public void findSum(TreeNode node,int sum){
		System.out.println("findSum function with 2 params");
		int depth=depth(node);
		int[] path=new int[depth];
		findSum(node,sum,path,0);
	}
	public void findSum(TreeNode node, int sum, int[] path, int level) {
		System.out.println("findSum function with 4 params");
		if(node==null) return;
		path[level]=node.value;
		int t=0;
		for(int i=level;i>=0;i--){
			t+=path[i];
			if(t==sum) print(path,i,level);
		}		
	}
    public static void main(String args[]){
    	TreeNode t1=new TreeNode(1);
    	TreeNode t2=new TreeNode(5);
    	TreeNode t3=new TreeNode(0);
    	TreeNode t4=new TreeNode(1);
    	TreeNode t5=new TreeNode(3);
    	TreeNode t6=new TreeNode(6);
    	TreeNode t7=new TreeNode(3);
    	TreeNode t8=new TreeNode(8);
    	TreeNode t9=new TreeNode(9);
    	t1.left=t2;
    	t1.right=t3;
    	t2.left=t9;
    	t2.right=t4;
    	t3.right=t5;
    	t4.left=t6;
    	t5.right=t7;
    	t5.left=t8;
    	new CC409().findSum(t1,3);
    }
}
