import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DriverClass {
	
	public static void main(String arg[]) throws IOException, ClassNotFoundException {
		
		Employee emp = new Employee("Ravi", 1);
		
		FileOutputStream fos = new FileOutputStream("index.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream("index.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		Employee e = (Employee) ois.readObject();
		
		System.out.println(" Employee"+ e);
		
		
	}

	
}
