package Java;

public class SelectionSort extends Sort{
	
	public static void main(String[] args){
		int[] data = {5, 3, 2, 4, 1};
		
		timeSort(new SelectionSort(), data);
	}
	
	public SelectionSort(){ super("Selection"); }
	
	private void selectionSort(int[] data, int low, int high){
	    for (int i = low; i < high; i++){
	        //search for min
	        int min = i;
	        for (int j = i + 1; j < high; j++)
	            if ( data[j] < data[min] )
	                min = j;
	        //swap
	        int temp = data[i];
	        data[i] = data[min];
	        data[min] = temp;
	    }
	}

	@Override
	public void sort(int []data){
	    selectionSort(data, 0, data.length);
	}
}
