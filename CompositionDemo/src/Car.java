
public class Car extends Vehicle {

	private int doors;
	private int enginePower;

	public Car(int doors, int enginePower,String name) {
		super(name);
		this.doors = doors;
		this.enginePower = enginePower;
	}

}
