import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<Integer> sharedList = new LinkedBlockingQueue<>();
		
		Consumer1 consumer = new Consumer1(sharedList);
		Producer1 produce = new Producer1(sharedList);
		
		Thread t1 =new Thread(produce);
		Thread t2 =new Thread(consumer);
		t1.start();
		t2.start();
	
	}
}

class Producer1 implements Runnable {
	BlockingQueue<Integer> sharedList;

	public Producer1(BlockingQueue<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				sharedList.put(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Consumer1 implements Runnable {
	BlockingQueue<Integer> sharedList;

	public Consumer1(BlockingQueue<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed" + sharedList.take());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
