import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] intArray =new int[5];
		intArray[0] = 1;
		intArray[1] = 45;
		intArray[2] = -54;
		intArray[3] = 2;
		intArray[4] = 87;
		
		int[] myArray= {1,9,0,4,5};
		
		for(int i:myArray) {
			System.out.println(i);
		}*/
		
		
		 Scanner scanner = new Scanner(System.in);
		 int numberOfPlayers = scanner.nextInt();
		 int playersArray[] = new int[numberOfPlayers];
		 int villansArray[] = new int[numberOfPlayers];
		 
		 for(int i=0;i<numberOfPlayers;i++)
		       {
			 playersArray[i] = scanner.nextInt();
		       }
		 for(int i=0;i<numberOfPlayers;i++)
	       {
			 villansArray[i] = scanner.nextInt();
	       }
		 
		 
		 scanner.close();
		Arrays.sort(playersArray);
		Arrays.sort(villansArray);
		for(int i : playersArray) {
			System.out.println(i);
		}
		for(int i : villansArray) {
			System.out.println(i);
		}
		
		

	}

}
