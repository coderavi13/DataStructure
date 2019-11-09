package com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ImplRunnable imp = new ImplRunnable();
		ImplCallable cal = new ImplCallable();
		
ExecutorService exe1= Executors.newCachedThreadPool();
exe1.execute(imp);

ExecutorService exe2= Executors.newFixedThreadPool(5);
exe2.execute(imp);

ExecutorService exe3= Executors.newSingleThreadExecutor();
exe3.execute(imp);

ScheduledExecutorService exe4= Executors.newScheduledThreadPool(10000);
//exe4.execute(imp);
exe4.schedule(imp, 3 , TimeUnit.SECONDS);

ExecutorService exe5 = Executors.newFixedThreadPool(1);
Future<String> f=exe5.submit(cal);
String message= f.get();

System.out.println(message);


//Thread t1=new Thread(imp);
//t1.start();

	}

}
