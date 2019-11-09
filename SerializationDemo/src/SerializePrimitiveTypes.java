import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

}

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
/*
 * Author : AnkitMittal Copyright- contents must not be reproduced in any form
 */
public class SerializePrimitiveTypes {

	public static void main(String[] args) {

		Employee object1 = new Employee(8);

		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(object1);
			fout.close();
			oout.close();
			System.out.println("Object Serialization completed.");

			// DeSerialization process >

			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);
			System.out.println("\nDeSerialization process has started, displaying employee objects...");
			Employee emp = (Employee) oin.readObject();
			System.out.println(emp);
			fin.close();
			oin.close();
			System.out.println("Object DeSerialization completed.");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}