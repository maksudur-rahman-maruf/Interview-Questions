public class MaxSum
{
	static int findSingle(int arr[], int size)
	{
		int res = arr[0];
		for(int i = 1; i < size; i++)
		{
			res = res ^ arr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 6, 2, 6, 3};
		int size = arr.length;
		
		System.out.println("Element Occuring Once is: " + findSingle(arr, size));
	}
}