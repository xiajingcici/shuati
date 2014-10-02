package cc150;

public class MergeSort {
	public void mergeSort(int[] array,int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(array,low,mid);
			mergeSort(array,mid+1,high);
			merge(array,low,mid,high);			
		}
	}
	public void merge(int[] array,int low,int mid,int high){
		int[] helper=new int[array.length];
		for(int i=0;i<array.length;i++){
			helper[i]=array[i];
		}
		int left=low;
		int midright=mid+1;
		int current=low;
		while(left<=mid&&midright<=high){
			if(helper[left]<=helper[midright]){
				array[current]=helper[left];
				left++;
				current++;
			}else{
				array[current]=helper[midright];
				midright++;
				current++;
			}
		}
		int remain=mid-left;
		for(int i=0;i<=remain;i++){
			array[current+i]=helper[left+i];
		}
	}
	public static void main(String[] args) {
		int[] ar={1,5,6,7,0,2,3,4};
		MergeSort m=new MergeSort();
		m.mergeSort(ar, 0, 7);
		for(int i:ar){
			System.out.println(i);
		}
	}

}
