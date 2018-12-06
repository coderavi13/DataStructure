
public class Main {

	public static void main(String[] args) {

		boolean isSorted = false;
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		// int[] intArray = { 1,2,3,4,5,6,7 };
		// int[] intArray = { 7,6,5,4,3,2,1 };
		//int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		int count = 0;
		int swapCount =0;

		for (int j = 1; j <= intArray.length; j++) {
			for (int i = 0; i < intArray.length - j; i++) {
				count++;
				isSorted = true;
				if (intArray[i] > intArray[i + 1]) {
					int temp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = temp;
					isSorted = false;
					swapCount++;
				}
			}
			if (isSorted)
				break;
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("Number of iterations=" + count);
		System.out.println("Swap Count=" + swapCount);

	}

}