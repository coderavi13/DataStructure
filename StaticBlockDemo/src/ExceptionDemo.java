import javax.management.RuntimeErrorException;

public class ExceptionDemo {
	
	public static void show() throws RuntimeErrorException {
		throw new RuntimeErrorException(null);
	}
	public static void main(String a[]) {
		try {
		show();}
		catch(Exception e) {
		System.out.println("dlfjdlfk");	e.printStackTrace();
		}
		
	}

}
