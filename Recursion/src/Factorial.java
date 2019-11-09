import java.util.Scanner;

public class Factorial {
	
	public static void main(String []args)
	{
		
		Scanner sc =new Scanner(System.in);
		int num,f ;
		num=sc.nextInt();
		sc.close();
		f=fact(num);
		System.out.printf("Factorial of Number %d is %d",num ,f );
		
	}
	
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n *fact(n-1);
		
	}

}
