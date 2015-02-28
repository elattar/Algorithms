import java.util.Arrays;

public class mergeSort {
	
	public int[] MergeSort (int array[])
	{
		if (array.length <= 1)
			return array;
		int mid = (array.length) / 2;
		int mid2 = (array.length) / 2 + (array.length) % 2;
		int arr1[] = new int [mid];
		int arr2[] = new int [mid2];
		
		for (int i=0 ; i<mid ; i++)
			arr1[i] = array[i];
		for (int i=0,j=mid ; j<array.length ; i++,j++)
			arr2[i] = array[j];
		
		arr1 = MergeSort(arr1);
		arr2 = MergeSort(arr2);
		
		return (merge(arr1 , arr2));
	}
	public int[] merge (int arr1[] , int arr2[])
	{
		int len = arr1.length + arr2.length;
		int result[] = new int [len];
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i=0 , j=0 , k=0;
		
		while (i!=arr1.length && j!=arr2.length)
		{
			if (arr1[i] <= arr2[j])
			{
				result[k] = arr1[i];
				i++;
				k++;
			}
			else
			{
				result[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i!=arr1.length)
		{
			result[k] = arr1[i];
			i++;
			k++;
		}
		while (j!=arr2.length)
		{
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10,2,3,4,15,5,7,0,4};
		int arr3[] = new int [9];
		
		mergeSort ms = new mergeSort();
		//arr3 = ms.merge(arr1, arr2);
		arr3 = ms.MergeSort(arr1);
		
		for (int i=0 ; i<arr3.length ; i++)
			System.out.print(arr3[i] + " ");
	}

}

