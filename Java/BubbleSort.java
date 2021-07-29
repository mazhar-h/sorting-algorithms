package Java;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] array = {5, 3, 2, 4, 1};
		long startTime, endTime;
		double time;
		
		BubbleSort bs = new BubbleSort();
		startTime = System.nanoTime();
		bs.sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Bubble Sort running time: %.7fs\n", time);
	}
	
	public void sort(int[] array){
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
			{	//swap
				if ( array[i] > array[j] )
				{
					int temp = array[i];
					array[i] =  array[j];
					array[j] = temp;
				}
			}
	}
}
