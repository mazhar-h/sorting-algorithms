package Java;

import java.util.Random;

public class Sort {
	
	public static void main(String[] args){
		int[] data = buildDataSet(10000);
		
		timeSort(new BubbleSort(), data);
		timeSort(new SelectionSort(), data);
		timeSort(new InsertionSort(), data);
		timeSort(new ShellSort(), data);
		timeSort(new HeapSort(), data);
		timeSort(new MergeSort(), data);
		timeSort(new QuickSort(), data);
		timeSort(new CountingSort(), data);
	}
	
	String name;
	
	public Sort(){ name = ""; }
	
	public void sort(int[] data){}
	
	public static void timeSort(Sort s, int[] data){
		int[] unsorted;
		long startTime, endTime;
		double time;
		
		unsorted = data.clone();
		startTime = System.nanoTime();
		s.sort(unsorted);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("%s Sort running time: %.7fs\n", s.name, time);
	}
	
	public static int[] buildDataSet(int size){
		int[] data = new int[size];
		Random rand = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < data.length; i++)
			data[i] = i+1;
		
		for(int i = 0; i < data.length; i++)
		{
			int temp = data[i];
			int pos = rand.nextInt(size);
			data[i] = data[pos];
			data[pos] = temp;
		}
		return data;
	}
}
