
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] intArray= {1,2,3,4,5,6,7};
		// int[] intArray = { 1, 2, 3, 4, 5, 6, 5 };
		// int[] intArray = { 8, 7, 6, 1, 2, 3, 4 };
		// int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };
		int count = 0;
		int tempElement;
		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < intArray.length; i++) {

				tempElement = intArray[i];
				int j;
				for (j = i; j >= gap && tempElement < intArray[j - gap]; j -= gap) {

					intArray[j] = intArray[j - gap];
					count++;
				}
				intArray[j] = tempElement;
			}
		}
		for (int k : intArray) {
			System.out.print(" " + k + " ");
		}
		System.out.println("Count of shifting : " + count);
	}

}
