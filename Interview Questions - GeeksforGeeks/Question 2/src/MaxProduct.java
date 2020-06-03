// 2) A unsorted array of integers is given; you need to find the max product formed my
// multiplying three numbers. (You cannot sort the array, watch out when there are 
// negative numbers)

public class MaxProduct {

	public static void main(String[] args) {
		int arr[] = {10,5,20,-5,7,15,4,-50,-9,1};
		int product;
		int maxProduct= -2147483648;
		
		for(int i=0; i<arr.length-2; i++)
		{
		    product = arr[i] * arr[i+1] * arr[i+2];	
		    if(product > maxProduct)
		    {
		         maxProduct = product;	
		    }
		    
		}
		
		System.out.println("Max Product is: " + maxProduct);
		

	}

}
