
public class Main {

    public static void main(String[] args) {
    	int[] intArray = { 7, 6, 5, 4, 3, 2, 1 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" "+ intArray[i] +" ");
        }
        System.out.print("\n");
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        
        System.out.print("Left");
        for (int i = 0; i < input.length; i++) {
            System.out.print(" "+ input[i] +" ");
        }
        System.out.print("\n");
        System.out.println("Left start "+start +" endMid " +mid);
        mergeSort(input, start, mid);             ////left mergeSort
       
       
        for (int i = 0; i < input.length; i++) {
            System.out.print(" "+ input[i] +" ");
        }
        System.out.print("\n");
        System.out.println("Right startEnd "+mid +" end " +end);
        mergeSort(input, mid, end);                ///right mergeSort
        
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {
        
    	 System.out.println("Merging  start "+start + " Mid "+mid +" end " +end);
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
        System.out.print("Merge");
        for (int i1 = 0; i1 < input.length; i1++) {
            System.out.print(" "+ input[i1] +" ");
        }
        System.out.println("\n");

    }

}
