package cc150;

public class CC903 {
	public int findMagic(int[] a){		
		if(a==null||a.length<1) return -1;
		return 	findMagic(a,0,a.length-1);
	}
	public int findMagic(int[] a,int begin,int end){
		if(end<begin||begin<0||end>=a.length) return -1;
		int mid=(begin+end)/2;
		int midVal=a[mid];
		if(midVal==mid) return mid;
		//left
		int leftIndex=Math.min(mid-1, midVal);
		int left=findMagic(a,begin,leftIndex);
		if(left>=0) return left;
		//right
		int rightIndex=Math.max(midVal, mid+1);
		int right=findMagic(a,rightIndex,end);
		return right;
	}
	public static void main(String args[]){
		int[] a={-40,-20,-1,1,2,3,7,7,7,7,7,7,7};
		CC903 c=new CC903();
		int x=c.findMagic(a);
		System.out.println(x);
	}
}
