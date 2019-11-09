
public class Driver {

	public static void main(String[] args) {
	
		QueueUsingStack queue = new QueueUsingStack();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());


	}

}
