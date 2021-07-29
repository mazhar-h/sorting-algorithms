package Java;

public class MergeSort {
	
	public static void main(String[] args){
		int[] array = Sort.buildDataSet(1000);
		long startTime, endTime;
		double time;
		
		MergeSort ms = new MergeSort();
		startTime = System.nanoTime();
		ms.sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Merge Sort running time: %.7fs\n", time);
	}
	
	private int[] merge(int[] array, int low, int middle, int high){
		int i = 0; // track arrayA's index
		int j = 0; // track arrayB's index
		int k = low; // track arrayC's index
		int lenA = middle - low + 1;
		int lenB = high - middle;
		
		int[] arrayA = new int[lenA];
		int[] arrayB = new int[lenB];
		
		for (int idx = 0; idx < lenA; idx++)
			arrayA[idx] = array[low + idx];
		
		for (int idx = 0; idx < lenB; idx++)
			arrayB[idx] = array[middle + idx + 1];
		
		//compare and merge
		while ( i < lenA && j < lenB )
		{
			if ( arrayA[i] < arrayB[j] )
				array[k] = arrayA[i++];
			else
				array[k] = arrayB[j++];
			k++;
		}
		
		//merge any trailing elements
		while ( i < arrayA.length )
			array[k++] = arrayA[i++];
		
		while ( j < arrayB.length )
			array[k++] = arrayB[j++];
		
		return array;
	}
	
	private void mergeSort(int[] array, int low, int high){
		if ( low < high )
		{
			int middle = (high - low) / 2 + low;
			mergeSort(array, low, middle);
			mergeSort(array, middle + 1, high);
			merge(array, low, middle, high);
		}
	}
	
	public void sort(int[] array){
		//sort entire array
		mergeSort(array, 0, array.length - 1);
	}
}
