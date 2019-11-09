public class MergeSort {
	static int count;
	public static void main(String[] args) {
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };
		 int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		//int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };

		mergeSort(intArray, 0, intArray.length);
		
		for(int element:intArray)
		{
			System.out.println(element);
		}

		/*
		 * for (int i = 0; i < intArray.length; i++) { System.out.println(intArray[i]);
		 * }
		 */
	}

	public static void mergeSort(int[] input, int start, int end) {
		System.out.println("count : " +count++);
		System.out.println("Start : " +start +" end : " +end);
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(input, start, mid);    //left mergeSort
		mergeSort(input, mid, end);        //Right mergeSort
		merge(input, start, mid, end);

	}

	public static void merge(int[] input, int start, int mid, int end) {
		/*
		 * if (input[mid - 1] < input[mid]) { return; }
		 */
		int[] tempArray = new int[end - start];
		int i = start;
		int j = mid;
		int tempIndex = 0;

		while (i < mid && j < end) {

			tempArray[tempIndex++] = input[i] < input[j] ? input[i++] : input[j++];
		}
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(tempArray, 0, input, start, tempIndex);
	}

}
