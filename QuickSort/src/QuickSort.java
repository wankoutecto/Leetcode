import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,8,9,7,3,1,5};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[]arr, int start, int end) {
		if(start >= end)return;
		
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}
	
	public static int partition(int[]arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;
		for(int j = start; j <= arr.length - 1; j++) {
			if(arr[j] < pivot) {
				i++;
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
		}
		i++;
		int tmp = arr[end];
		arr[end] = arr[i];
		arr[i] = tmp;
		
		return i;
	}
	

}
