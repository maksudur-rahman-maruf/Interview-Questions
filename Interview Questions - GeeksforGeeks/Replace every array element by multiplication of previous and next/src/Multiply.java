
public class Multiply {
	
	static void modify(int arr[], int size)
	{
		int prev = arr[0];
		arr[0] = arr[0] * arr[1];
		
		for(int i = 1; i < size-1; i++)
		{
			int curr = arr[i];
			arr[i] = prev * arr[i+1];
			prev = curr;
		}
		arr[size-1] = prev * arr[size-1];
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, 6};
		int size = arr.length;
		
		modify(arr, size);
		
		for(int i: arr)
		{
			System.out.print(i + " ");
		}

	}

}
