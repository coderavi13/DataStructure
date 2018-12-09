
public class InsertionSort {

	public static void main(String[] args) {
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };
		// int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };

		int pivot;

		for (int i = 1; i < intArray.length; i++) {

			pivot = intArray[i];
			int j;

			for (j = i; j > 0 && pivot < intArray[j-1]; j--) {

				intArray[j] = intArray[j-1];
			}

			intArray[j] = pivot;

		}
		for (int k : intArray) {
			System.out.print(" " + k + " ");
		}

	}

}
