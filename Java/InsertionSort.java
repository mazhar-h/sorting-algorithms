package Java;

public class InsertionSort extends Sort{
	
	public static void main(String[] args){
		int[] data = Sort.buildDataSet(5);
		
		Sort.runSort(new InsertionSort(), data);
	}
	
	public InsertionSort(){ name = "Insertion"; }
	
	private void insertionSort(int[] data){
		for (int i = 1; i < data.length; i++)
		{
			int temp = data[i]; // create hole

			//slide greater elements down
			int j;
			for (j = i; j > 0 && data[j-1] > temp; j--)
				data[j] = data[j-1];
			
			data[j] = temp;
		}
	}
	
	@Override
	public void sort(int[] data){		
		insertionSort(data);
	}
}
