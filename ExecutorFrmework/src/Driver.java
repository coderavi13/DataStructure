
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		//ExecutorService ex = Executors.newFixedThreadPool(2);
		
		
		/*
		 * ex.execute(new Runnable(){ public void run() {
		 * System.out.println("Hi Thread 1"); } });
		 * 
		 * ex.execute(new Runnable(){ public void run() {
		 * System.out.println("Hi Thread 2"); } });
		 */
		 
		/*
		 * Future<String> f =ex.submit(new Callable<String>(){ public String call() {
		 * System.out.println("Hi Thread 3"); return "Ravi"; } });
		 */
	//	System.out.println(f.get());
		
		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});

		//String result = ex.invokeAny(callables);
		List<Future<String>> fs = ex.invokeAll(callables);
		
	     for(Future<String> f : fs) {
	    	 
	    	 System.out.println(f.get());
	     }
	}

}
