public class Main {

	public static void main(String[] args) {
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };
		// int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };
		int count = 0;

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];

			int i;

			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
				count++;
			}

			intArray[i] = newElement;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("shifting Count : " + count);

	}

}