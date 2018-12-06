// Owner : Ravi
public class SelectionSort {

	public static void main(String[] args) {

		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray ={7,6,5,4,3,2,1};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int j;
		int swapCount = 0;
		int indexOfLargest;
		
		for (int i = 0; i < intArray.length; i++) {
			
			indexOfLargest = 0;
			
			for (j = 1; j < intArray.length - i; j++) {

				
				if (intArray[indexOfLargest] < intArray[j]) {
					indexOfLargest = j;
				}
			}

			j--;
			
			if (indexOfLargest != j) {
				
				int temp = intArray[indexOfLargest];
				intArray[indexOfLargest] = intArray[j];
				intArray[j] = temp;
				
				swapCount++;
			}	
		}
	
		for (int element : intArray) {
			System.out.print(" " + element + " ");
		}

		System.out.println("\nSwapp Count " + swapCount);

	}

}
