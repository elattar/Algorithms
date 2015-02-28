import java.util.Arrays;


public class Counting_Inversion {
	
	public int countInv (int array[])
	{
		if (array.length == 1)
			return 0;
		
		int mid = array.length/2;
		int mid2 = (array.length/2) + (array.length%2);
		
		int []left = new int[mid];
		int []right = new int[mid2];
		
		for (int i=0 ; i<mid ; i++)
			left[i] = array[i];
		for (int i=0,j=mid ; j<array.length ; i++,j++)
			right[i] = array[j];
		
		return (countInv(left) + countInv(right) + mergeAndCount(left, right));
	}
	public int mergeAndCount (int arr1[] , int arr2[])
	{
		int len = arr1.length + arr2.length;
		int result[] = new int [len];
		int i=0 , j=0 , k=0;
		int count = 0;
		
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
				count+= (arr1.length - i);
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
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,2,4,6};
		int count;
		Counting_Inversion CI = new Counting_Inversion();
		count = CI.countInv(arr);
		
		System.out.println(count);
	}

}
