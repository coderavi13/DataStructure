
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String []args)
	{
		
		Scanner sc =new Scanner(System.in);
		int num,f,i=1 ;
		num=sc.nextInt();
		sc.close();
		while(num>=i) {
		f=fibo(i);
		i++;
		System.out.println(f );
		}
			
	}
	
	static int fibo(int n)
	{
		if(n==1 || n==2)
			return n-1;
		else
			return fibo(n-1) +fibo(n-2);
		
	}

}
