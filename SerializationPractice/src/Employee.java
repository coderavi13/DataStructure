import java.io.Serializable;

public class Employee implements Serializable {

	String name ;
	int roll;
	public Employee(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", roll=" + roll + "]";
	}

}
