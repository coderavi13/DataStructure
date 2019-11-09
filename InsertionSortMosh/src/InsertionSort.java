
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = { 8,6,4,615,12,35,14};
			
		for(int i = 1 ; i<arr.length;i++) {
			int pivot =arr[i];
			int j = i-1 ;
			
			while(  j >=0 && arr[j] > pivot) {
				arr[j+1] =arr[j];
				j--;
					
			}
			arr[j+1] =pivot;
			
		}
		
		for (int i : arr) {
			System.out.println(i);
			
		}

	}

}
