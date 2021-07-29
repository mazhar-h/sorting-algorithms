package Java;

public class QuickSort {
	
	public static void main(String[] args){
		int[] array = Sort.buildDataSet(1000);
		long startTime, endTime;
		double time;
		
		QuickSort qs = new QuickSort();
		startTime = System.nanoTime();
		qs.sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Quick Sort running time: %.7fs\n", time);
	}
	
	private void swap(int[] array, int idx1, int idx2){
		int temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}
	
	private int medianOfThree(int[] array, int low, int high){
        int middle = ( low + high ) / 2;
        
        if( array[middle] < array[low] )
            swap(array, low, middle);
        if( array[high] <array[low] )
            swap(array, low, high);
        if( array[high] < array[middle] )
            swap(array, middle, high);

        swap(array, middle, high-1);  

        return high-1;
	}
	
	private int partition(int[] array, int low, int high){
		int pivot = medianOfThree(array, low, high);
		
		//move elements larger than the pivot
		//to the right of the pivot
		while (low < pivot)
		{
			if ( array[low] > array[pivot] )
			{
				int temp = array[low];
				array[low] = array[pivot - 1];
				array[pivot - 1] = array[pivot];
				array[pivot] = temp;
				pivot--;
			}
			else
				low++;
		}
		return pivot;
	}
	
	private void quickSort(int[] array, int low, int high){
		if ( low < high)
		{
			int index = partition(array, low, high);
			quickSort(array, low, index - 1);
			quickSort(array, index + 1, high);
		}
	}
	
	public void sort(int[] array){
		quickSort(array, 0, array.length - 1);
	}
}
