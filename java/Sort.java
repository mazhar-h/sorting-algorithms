package Java;
import Java.MergeSort;
import Java.QuickSort;

public class Sort {
	
	public static void main(String[] args){
		int[] array = {5, 3, 2, 4, 1};
		int[] unsorted;
		long startTime, endTime;
		double time;
		
		unsorted = array.clone();
		startTime = System.nanoTime();
		QuickSort.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Quick Sort running time: %.7fs\n", time);

		unsorted = array.clone();
		startTime = System.nanoTime();
		MergeSort.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Merge Sort running time: %.7fs\n", time);
	}
}
