package Java;

public class QuickSort {
	
	public static void main(String[] args){
		int[] array = {5, 3, 2, 4, 1};
		long startTime, endTime;
		double time;
		
		startTime = System.nanoTime();
		sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Quick Sort running time: %.7fs\n", time);
	}
	
	private static int partition(int[] arr, int low, int high){
		int pivot = high;
		
		//move elements larger than the pivot
		//to the right of the pivot
		while (low < pivot)
		{
			if ( arr[low] > arr[pivot] )
			{
				int temp = arr[low];
				arr[low] = arr[pivot - 1];
				arr[pivot - 1] = arr[pivot];
				arr[pivot] = temp;
				pivot--;
			}
			else
				low++;
		}
		
		return pivot;
	}
	
	private static void quickSort(int[] array, int low, int high){
		if ( low < high)
		{
			int index = partition(array, low, high);
			quickSort(array, low, index - 1);
			quickSort(array, index + 1, high);
		}
	}
	
	public static void sort(int[] array){
		quickSort(array, 0, array.length - 1);
	}
}
