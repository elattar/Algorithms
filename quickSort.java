
public class quickSort {
	
	public int pivotAtFirst(int arr[], int left , int right)
	{
		if (arr.length <= 1)
			return 0;

		int pivot = arr[left], i=left+1;
		for (int j=left+1 ; j<=right ; j++)
		{
			if(arr[j]<pivot)
			{
				swap(arr,j,i);
				i++;
			}
		}
		swap(arr, left, i-1);
		
		// return the index of pivot
		return i-1;
	}
	public void QuickSort(int arr[], int start, int end)
	{		
		int mid = pivotAtFirst(arr, start, end);
		if (start < mid - 1)
			QuickSort(arr, start, mid-1);
		
		if (end > mid)
			QuickSort(arr, mid+1, end);
		
	}
	public void swap (int []a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) 
	{
		quickSort q = new quickSort();
		int[] input = {4,10,2,1};
		q.QuickSort(input, 0, input.length-1);
		for (int i=0 ; i<input.length ; i++)
			System.out.print(input[i] + " ");
		//System.out.println(comp);
	}

}
