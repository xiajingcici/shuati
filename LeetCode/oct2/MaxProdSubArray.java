package oct2;

public class MaxProdSubArray {
	public int maxProduct(int[] A){
		if(A.length==0||A==null) return 0;
		if(A.length==1) return A[0];
		int max=A[0],min=A[0],maxProduct=A[0];
		for(int i=1;i<A.length;i++){
			int max_temp=max;
			max=Math.max(Math.max(A[i]*max, A[i]),A[i]*max_temp);
			min=Math.min(Math.min(A[i]*max_temp,A[i]),A[i]*min);
			maxProduct=Math.max(maxProduct, max);
			System.out.println(max+" "+min+" "+maxProduct);
		}
		
		return maxProduct;
	}
	
	public static void main(String[] args) {
		int[] A={-4,-3};
		MaxProdSubArray m=new MaxProdSubArray();
		int res=m.maxProduct(A);
		System.out.println(res);
	}

}
