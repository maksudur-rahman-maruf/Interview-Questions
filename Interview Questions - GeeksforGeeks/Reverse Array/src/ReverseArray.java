
public class ReverseArray {
	
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static void reverseArray(int arr[])
	{
		int start = 0;
		int end = arr.length-1;
		int temp;
		
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {1,10,20,80,90,2};
		
		printArray(arr);
		
		reverseArray(arr);
		
		System.out.println("After Reversing: ");
		printArray(arr);

	}

}
