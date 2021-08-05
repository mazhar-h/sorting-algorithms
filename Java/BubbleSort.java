package Java;

public class BubbleSort extends Sort{
	
	public static void main(String[] args){
		int[] data = {5, 3, 2, 4, 1};
		
		timeSort(new BubbleSort(), data);
	}
	
	public BubbleSort(){ super("Bubble"); }
	
	private void bubbleSort(int[] data, int low, int high){
		for (int i = low; i < high; i++)
			for (int j = low; j < high - i - 1; j++)
			{	//swap
				if ( data[j] > data[j+1] )
				{
					int temp = data[j];
					data[j] =  data[j+1];
					data[j+1] = temp;
				}
			}
	}
	
	@Override
	public void sort(int[] data){
		bubbleSort(data, 0, data.length);
	}
}
