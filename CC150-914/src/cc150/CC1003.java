package cc150;

public class CC1003 {
	public int searchRotate(int[] a,int left,int right,int target){
		int mid=(left+right)/2;
		if(a[mid]==target) return mid;
		if(right<left) return -1;
		if(a[mid]<a[left]){
			if(target<=a[right]&&target>=a[mid]){
				return searchRotate(a,mid+1,right,target); 
			}else{
				return searchRotate(a,left,mid-1,target);
			}
		}else if(a[mid]<a[left]){
			if(target>=a[right]&&target<=a[mid]){
				return searchRotate(a,mid+1,right,target);
			}else{
				return searchRotate(a,left,mid-1,target);
			}
		}else{
			if(a[mid]!=a[right]){
				return searchRotate(a,mid+1,right,target);
			}else{
				int res=searchRotate(a,left,mid-1,target);
				if(res==-1) return searchRotate(a,mid+1,right,target);
				else return res;
			}
		}
	}
	public static void main(String[] args) {
		CC1003 c3=new CC1003();
		int[] a={5,6,7,0,1,2,3,4};
		int target=3;
		int x=c3.searchRotate(a,0,a.length-1,target);
		System.out.println(x);
	}
}
