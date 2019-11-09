
public class SelectionSort {

	public static void main(String[] args) {
	
		
		int[] array = {8,9,11,2,7,55,4,6};
		
		for(int i=0;i<array.length;i++) {
			int minIndex = i;
			for(int j = i;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					int temp= array[j];
					array[j]=array[minIndex];
					array[minIndex]=temp;
				}
				
			}
		}
		
		for (int i : array) {
			System.out.println(i);
			
		}

	}

}
