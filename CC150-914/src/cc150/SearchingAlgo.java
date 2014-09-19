package cc150;

public class SearchingAlgo {
	int binarySearch(int[] a,int target){
		int low=0,high=a.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(target>a[mid]){
				low=mid+1;
			}else if(target<a[mid]){
				high=mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	int binarySearchRecur(int[] a,int low,int high,int target){
		int mid=(high+low)/2;
		int res=-1;
		if(target==a[mid]) return mid;
		else if(target<a[mid]) res=binarySearchRecur(a,0,mid,target);
		else res=binarySearchRecur(a,mid+1,high,target);
		return res;
	}

	public static void main(String[] args) {
		SearchingAlgo sa=new SearchingAlgo();
		int[] a={1,2,3,4,5,6,7};
		int target=3;
		int x=sa.binarySearchRecur(a,0,a.length-1,target);
		System.out.println(x);
		
	}

}
