package cc150;

public class QuickSort {
	public void quickSort(int[] array, int left, int right) {
		if(left>right) return;
		int pivot = array[right];

		int index = partition(array, left, right);
		if(left==right){
			System.out.println("left="+left+" right="+right+" index="+index);
		}
		array[index] = pivot;
		if (left < index - 1) {
			quickSort(array, left, index - 1);
			quickSort(array, index + 1, right);
		}

	}
	public int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int[] helper = new int[array.length];
		int a = left, z = right;
		for (int i = left; i < right + 1; i++) {
			if (array[i] <= pivot) {
				helper[a] = array[i];
				a++;
			} else {
				helper[z] = array[i];
				z--;
			}
			if (a == z) {
				helper[a] = pivot;
				break;
			}
		}
		for (int j = left; j < right + 1; j++) {
			array[j] = helper[j];
		}
		return a;
	}

	public static void main(String[] args) {
		int[] ar = { 1, 5, 6, 7, 0, 2, 3, 3,8};
		QuickSort q = new QuickSort();
		q.quickSort(ar, 0, 7);
		for (int i : ar) {
			System.out.println(i);
		}
	}

	public void printArray(int[] array) {
		System.out.print("[");
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println("]");
	}
}
	

