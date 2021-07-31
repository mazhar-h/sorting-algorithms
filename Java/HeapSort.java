package Java;

import java.util.PriorityQueue;

public class HeapSort {
	
	public static void main(String[] args){
		int[] array = Sort.buildDataSet(1000);
		long startTime, endTime;
		double time;
		
		HeapSort hs = new HeapSort(array);
		startTime = System.nanoTime();
		hs.sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Heap Sort running time: %.7fs\n", time);
	}
	
	PriorityQueue<Integer> heap;
	
	private HeapSort(){};
	
	public HeapSort(int[] array){
		heap = new PriorityQueue<>();
		buildHeap(array);
	}
	
	private void buildHeap(int[] array){
		for (int e : array)
			heap.add(e);
	}
	
	public void sort(int[] array){
		for (int i = 0; i < array.length; i++)
			array[i] = heap.remove(); //get min element
	}
}
