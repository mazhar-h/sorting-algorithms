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
		for (int i = 1; i < array.length; i++)
		{
			int temp = array[i]; // create hole
			int j;

			//slide greater elements down
			for (j = i; j > 0; j--)
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
