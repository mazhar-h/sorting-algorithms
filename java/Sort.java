public class Sort {
	
	public static void main(String[] args){
		int[] array = {5, 3, 2, 4, 1};
		long startTime, endTime;
		
		startTime = System.nanoTime();
		mergesort(array);
		endTime = System.nanoTime();
		System.out.printf("Mergesort running time: %d nanoseconds\n", (endTime - startTime));
		
		int[] temp = array.clone();
		int high = temp.length - 1;
		startTime = System.nanoTime();
		quicksort(temp, 0, high);
		endTime = System.nanoTime();
		System.out.printf("Quicksort running time: %d nanoseconds\n", endTime - startTime);
	}
	
	private static int[] merge(int[] arrayA, int[] arrayB){
		int[] arrayC = new int[arrayA.length+arrayB.length];
		
		int i = 0; // track arrayA's index
		int j = 0; // track arrayB's index
		int k = 0; // track arrayC's index
		
		//compare and merge
		while ( i != arrayA.length && j != arrayB.length )
		{
			int a = arrayA[i];
			int b = arrayB[j];
			
			if ( a < b )
			{
				arrayC[k] = a;
				i++;
			}
			else {
				arrayC[k] = b;
				j++;
			}
			k++;
		}
		
		//merge any trailing elements
		while ( i != arrayA.length )
			arrayC[k++] = arrayA[i++];
		
		while ( j != arrayB.length )
			arrayC[k++] = arrayB[j++];
		
		return arrayC;
	}
	
	public static int[] mergesort(int[] array){
		int n = array.length;
		
		if ( n == 1 )
			return array;
		
		int[] arrayOne = new int[n/2];
		int[] arrayTwo = new int[n - arrayOne.length];
		
		for (int i = 0; i < arrayOne.length; i++)
			arrayOne[i] = array[i];
		
		for (int i = 0; i < arrayTwo.length; i++)
			arrayTwo[i] = array[(n/2)+i];
		
		arrayOne = mergesort(arrayOne);
		arrayTwo = mergesort(arrayTwo);
		
		return merge(arrayOne, arrayTwo);
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
	
	public static void quicksort(int[] arr, int low, int high){
		if ( low < high)
		{
			int index = partition(arr, low, high);
			quicksort(arr, low, index - 1);
			quicksort(arr, index + 1, high);
		}
	}
}
