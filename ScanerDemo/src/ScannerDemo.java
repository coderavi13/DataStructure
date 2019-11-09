import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();
        double d=scan.nextDouble();
       
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);
    }
}
