//Author : Ravi
public class QuickSort {

	public static void main(String[] args) {
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };
		// int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int[] intArray = { 7, 6, 5, 9, 4, 3, 2, 1 };
		System.out.println("\nBefore Sort :");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i] + " ");
		}
		sort(intArray, 0, intArray.length-1);

		System.out.println("\nAfter Sort :");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i] + " ");
		}
	}

	public static void sort(int[] input, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = input[(start + end) / 2]; // We can select any element as Pivot element
		int i = start;
		int j = end;
		while (i < j) {
			while (input[i] < pivot) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
		input[i] = pivot; // As i and j value will be same we can use any of the 'i' or 'j'
		sort(input, start, i - 1);
		sort(input, i + 1, end);

	}

}
