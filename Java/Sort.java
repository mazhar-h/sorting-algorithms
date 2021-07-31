package Java;

import java.util.Random;

public class Sort {
	
	public static void main(String[] args){
		int[] array = buildDataSet(100000);
		
		runSort(array);
	}
	
	public static void runSort(int[] array){
		int[] unsorted;
		long startTime, endTime;
		double time;
		
		BubbleSort bs = new BubbleSort();
		unsorted = array.clone();
		startTime = System.nanoTime();
		bs.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Bubble Sort running time: %.7fs\n", time);
		
		InsertionSort is = new InsertionSort();
		unsorted = array.clone();
		startTime = System.nanoTime();
		is.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Insertion Sort running time: %.7fs\n", time);
		
		ShellSort ss = new ShellSort();
		unsorted = array.clone();
		startTime = System.nanoTime();
		ss.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Shell Sort running time: %.7fs\n", time);
		
		HeapSort hs = new HeapSort(array);
		startTime = System.nanoTime();
		hs.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Heap Sort running time: %.7fs\n", time);
		
		MergeSort ms = new MergeSort();
		unsorted = array.clone();
		startTime = System.nanoTime();
		ms.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Merge Sort running time: %.7fs\n", time);
		
		QuickSort qs = new QuickSort();
		unsorted = array.clone();
		startTime = System.nanoTime();
		qs.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Quck Sort running time: %.7fs\n", time);
	}
	
	public static int[] buildDataSet(int size){
		int[] array = new int[size];
		Random rand = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < array.length; i++)
			array[i] = i+1;
		
		for(int i = 0; i < array.length; i++)
		{
			int temp = array[i];
			int pos = rand.nextInt(size);
			array[i] = array[pos];
			array[pos] = temp;
		}
		return array;
	}
}
