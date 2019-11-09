import javax.sql.rowset.Joinable;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("From Main Thread");
		
		//Thread another = new AnotherThread();
		//another.start();
		
		AnotherThread t1 =new AnotherThread();
		t1.start();
		
		t1.join();
		
		
		System.out.println("After Another in Main Thread");

	}

}
