import java.util.List;

class Producer implements Runnable {

	List<Integer> sharedList;
	final int MAX = 3;

	public Producer(List<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == MAX) {
				System.out.println("List is full");
				sharedList.wait();	
			}
		}
		
		synchronized (sharedList) {	
				sharedList.add(i);
				Thread.sleep(1000);
				sharedList.notify();
		}
	}
}
