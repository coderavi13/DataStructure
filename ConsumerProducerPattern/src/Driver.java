import java.util.LinkedList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<Integer> sharedList = new LinkedList<Integer>();
		
		Consumer consumer = new Consumer(sharedList);
		Producer produce = new Producer(sharedList);
		
		Thread t1 =new Thread(produce);
		Thread t2 =new Thread(consumer);
		System.out.println("Started");
		t1.start();
		System.out.println("producer");
		
		t2.start();
		System.out.println("consumer");
		
	}

}
