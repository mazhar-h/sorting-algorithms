package Java;

public class MergeSort extends Sort{
	
	public static void main(String[] args){
		int[] data = buildDataSet(5);
		
		timeSort(new MergeSort(), data);
	}
	
	public MergeSort(){ super("Merge"); }
	
	private int[] merge(int[] data, int low, int middle, int high){
		int i = 0; 		// track dataA's index
		int j = 0; 		// track dataB's index
		int k = low; 	// track data's index
		int lenA = middle - low + 1;
		int lenB = high - middle;
		
		int[] dataA = new int[lenA];
		int[] dataB = new int[lenB];
		
		for (int idx = 0; idx < lenA; idx++)
			dataA[idx] = data[low + idx];
		
		for (int idx = 0; idx < lenB; idx++)
			dataB[idx] = data[middle + idx + 1];
		
		//compare and merge
		while ( i < lenA && j < lenB )
		{
			if ( dataA[i] < dataB[j] )
				data[k++] = dataA[i++];
			else
				data[k++] = dataB[j++];
		}
		
		//merge any trailing elements
		while ( i < dataA.length )
			data[k++] = dataA[i++];
		
		while ( j < dataB.length )
			data[k++] = dataB[j++];
		
		return data;
	}
	
	private void mergeSort(int[] data, int low, int high){
		if ( low < high )
		{
			int middle = (high - low) / 2 + low;
			mergeSort(data, low, middle);
			mergeSort(data, middle + 1, high);
			merge(data, low, middle, high);
		}
	}
	
	@Override
	public void sort(int[] data){
		mergeSort(data, 0, data.length - 1);
	}
}
