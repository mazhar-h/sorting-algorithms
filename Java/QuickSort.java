package Java;

public class QuickSort extends Sort{
	
	public static void main(String[] args){
		int[] data = buildDataSet(5);
		
		timeSort(new QuickSort(), data);
	}
	
	public QuickSort(){ super("Quick"); }
		
	private int medianOfThree(int[] data, int low, int high){
        int middle = ( low + high ) / 2;
        
        if( data[middle] < data[low] )
            swap(data, low, middle);
        if( data[high] <data[low] )
            swap(data, low, high);
        if( data[high] < data[middle] )
            swap(data, middle, high);

        swap(data, middle, high-1);  

        return high-1;
	}
	
	private int partition(int[] data, int low, int high){
		int pivot = medianOfThree(data, low, high);
		
		//move elements larger than the pivot
		//to the right of the pivot
		while (low < pivot)
		{
			if ( data[low] > data[pivot] )
			{
				int temp = data[low];
				data[low] = data[pivot - 1];
				data[pivot - 1] = data[pivot];
				data[pivot] = temp;
				pivot--;
			}
			else
				low++;
		}
		return pivot;
	}
	
	private void quickSort(int[] data, int low, int high){
		if ( low < high)
		{
			int index = partition(data, low, high);
			quickSort(data, low, index - 1);
			quickSort(data, index + 1, high);
		}
	}
	
	@Override
	public void sort(int[] data){
		quickSort(data, 0, data.length - 1);
	}
	
	private void swap(int[] data, int index1, int index2){
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
}
