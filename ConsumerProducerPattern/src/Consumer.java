
import java.util.List;

class Consumer implements Runnable {

	List<Integer> sharedList;
	final int MAX = 3;

	public Consumer(List<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	@Override
	public void run() {

	while(true) {

			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == 0) {
				System.out.println("List is empty");
				sharedList.wait();	
			}
		}
		
		synchronized (sharedList) {	
				
				Thread.sleep(1000);
				System.out.println("Consumed "+ sharedList.remove(0));
				sharedList.notify();
		}
	}
}
