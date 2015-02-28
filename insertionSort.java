package Sorting_Algorithms;

public class insertionSort {
	
	static void swap (int i, int j, int[] arr) 
	{
		  int t = arr[i];
		  arr[i] = arr[j];
		  arr[j] = t;
	}
	
	public static void main(String[] args) {
		
		int []arr = {4 , 23 , 5 , 2 , 1 , 3 , 7, 11 , 5 , 6};
		
		for (int i=0 ; i<arr.length ; i++)
		{
			for (int j=i ; j>0 ; j--)
			{
				if (arr[j] < arr[j-1])
					swap(j, j-1 , arr);
				else
					break;
			}
		}
		
		for (int i=0 ; i<10 ; i++)
			System.out.print(arr[i] + " ");
	}

}
