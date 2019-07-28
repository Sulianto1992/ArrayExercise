package array; //Name of the package

public class LinearSearch {

	public static int search(int arr[], int x)
	{
		int n = arr.length; //Retrieve the length of the array
		
		for (int i = 0; i < n; i++) //Finite Loop
		{
			if (arr[i] == x) //Returns the value if x is found
				return i;
		}
		return -1;
	} //end search
	
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4, 10, 40}; //Declare the array
		
		int x = 10; //Declare and initialize the variable
		
		int result = search(arr, x); //Invoke the method
		
		if (result == -1) //Display the result based on the condition
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at index " + result);
		
	} //end main

} //end LinearSearch
