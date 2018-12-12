public class MergeSort {
	public static void main(String[] args) {
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };
		// int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };

		mergeSort(intArray, 0, intArray.length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void mergeSort(int[] input, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);

	}

	public static void merge(int[] input, int start, int mid, int end) {
		if (input[mid - 1] < input[mid]) {
			return;
		}
		int[] tempArray = new int[end - start];
		int i = start;
		int j = mid;
		int k = 0;

		while (i < mid && j < end) {

			tempArray[k++] = input[i] < input[j] ? input[i++] : input[j++];
		}
		System.arraycopy(input, i, input, start + k, mid - i);
		System.arraycopy(tempArray, 0, input, start, k);
	}

}
