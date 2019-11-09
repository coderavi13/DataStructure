import java.util.concurrent.TimeUnit;

 class ThreadingDemo {

	public static void main(String[] args) {
		
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		  long startTime = System.nanoTime();
		  
		   
		 
		    long endTime = System.nanoTime();
		 
		    long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
		 
		    //Same duration in millis
		     
		    long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in nano seconds
		     
		    System.out.println(durationInNano);
		    System.out.println(durationInMillis);
		
obj1.start();
obj2.start();
	}

}

class Hi extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hi");
		try {Thread.sleep(1000);}
		catch(Exception e) {}
	}
	}
}

class Hello extends Thread
{
	

	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		
		try {Thread.sleep(1000);}
		catch(Exception e) {}
	}
	}
}
