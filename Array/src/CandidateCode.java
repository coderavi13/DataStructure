
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

 Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of test cases betwen 1 to 10");
int testCases =scanner.nextInt();

for (int i=0;i<testCases;i++){
System.out.println("Enter number of players and villans between 1 to 1000");

	 int numberOfPlayers = scanner.nextInt();
		 int playersArray[][] = new int[i][numberOfPlayers];
		 int villansArray[][] = new int[i][numberOfPlayers];
		 
		 for(int player=0;player<numberOfPlayers;player++)
		       {
			 playersArray[i][player] = scanner.nextInt();
		       }
		 for(int villan=0;villan<numberOfPlayers;villan++)
	       {
			 villansArray[i][villan] = scanner.nextInt();
	       } 
		
         Arrays.sort(playersArray);
		 Arrays.sort(villansArray);
			Arrays.sort(villansArray);
			for(int player : playersArray[i]) {
				System.out.println(player);
			}
			for(int villan : villansArray[i]) {
				System.out.println(villan);
			}
			

}
scanner.close();

   }
}
