
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		int pivot;

		for (int i = 1; i < intArray.length; i++) {
			
			pivot = intArray[i];
			
			for (int j = i - 1; j >= 0; j--) {
				
				if (pivot < intArray[j]) {
					
					intArray[j + 1] = intArray[j];
				} 
				else {
					
					intArray[j + 1] = pivot;
					break;
				}
				if (j == 0) {
					
					intArray[j] = pivot;
				}
			}
		}
		for (int k : intArray) {
			System.out.print(" " + k + " ");
		}

	}

}
