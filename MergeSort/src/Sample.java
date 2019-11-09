public class Sample {
	static int count;
	public static void main(String[] args) {
	

		 int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		mergeSort(intArray, 0, intArray.length);
		
		for(int element:intArray)
		{
			System.out.println(element);
		}

	}

	public static void mergeSort(int[] input, int start, int end) {

		System.out.println("count : " +count++);
		System.out.println("Start : " +start +" end : " +end);
		
		if (end == start) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(input, start, mid);    //left mergeSort
		mergeSort(input, mid+1, end);        //Right mergeSort
		merge(input, start, mid+1, end);

	}

	public static void merge(int[] input, int start, int mid, int end) {
		/*
		 * if (input[mid - 1] < input[mid]) { return; }
		 */
		
		System.out.println("Start : " +start +" end : " +end + " mid " +mid);
		int[] tempArray = new int[end - start];
		int i = start;
		int j = mid;
		int tempIndex = 0;

		while (i < mid && j < end) {

			tempArray[tempIndex++] = input[i] < input[j] ? input[i++] : input[j++];
		}
		System.arraycopy(input, i, input, start + tempIndex, mid- i);
		System.arraycopy(tempArray, 0, input, start, tempIndex);
	}

}
