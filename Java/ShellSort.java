package Java;

public class ShellSort {
	
	public static void main(String[] args){
		int[] array = Sort.buildDataSet(1000);
		long startTime, endTime;
		double time;
		
		ShellSort ss = new ShellSort();
		startTime = System.nanoTime();
		ss.sort(array);
		endTime = System.nanoTime();
		time = (double) (endTime - startTime) / 1000000000;
		System.out.printf("Shell Sort running time: %.7fs\n", time);
	}
	
	public void sort(int[] array){
	     int j;
	     
	     for( int gap = array.length/2; gap > 0; gap /= 2 ) // determine sequence
	         for( int i = gap; i < array.length; i++ )
	         {
	             int temp = array[i]; // create hole
	             
	             //slide greater elements down
	             for(j = i; j >= gap; j -= gap )
	             {	 	            	 
	            	 if ( array[j-gap] > temp )
	            		 array[j] = array[j-gap];
	            	 else
	            		 break;
	             }
	             array[j] = temp;
	         }
	}

}
