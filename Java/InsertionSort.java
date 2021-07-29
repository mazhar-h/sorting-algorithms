package Java;

public class InsertionSort {
	
	public static void main(String[] args){
		int[] array = Sort.buildDataSet(1000);
		long startTime, endTime;
		double time;
		
		InsertionSort is = new InsertionSort();
		startTime = System.nanoTime();
		is.sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Insertion Sort running time: %.7fs\n", time);
	}
	
	public void sort(int[] array){
		int j;
		
		for (int p = 1; p < array.length; p++)
		{
			int temp = array[p]; // create hole
			
			//slide greater elements down
			for (j = p; j > 0; j--)
			{
				if ( array[j-1] > temp )
					array[j] = array[j-1];
				else
					break;
			}
			array[j] = temp;
		}
	}
}
