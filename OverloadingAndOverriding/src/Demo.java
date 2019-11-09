class FirstClass {
	public String name="Ravi";
	
	protected  void display(int a)
	{
		System.out.println("Firts display \n" + this.name);
	}
	protected  void display(long a)
	{
		System.out.println("Firts long \n" + this.name);
	}
	
	public String display(String name)
	{
		System.out.println(name);
		return name;
	}
	
}

class SecondClass extends FirstClass {
	public String name="Vedant";
	
	public void display()
	{
		System.out.println("Second display \n" + this.name);
	}
	
}

public class Demo {

	public static void main(String[] args) {
		FirstClass fc =new FirstClass();
		String s= fc.display("RAVI");
		System.out.println(s);
		
		
		FirstClass f=new FirstClass();
		f.display(10L);
		//SecondClass sc = new SecondClass();
		FirstClass sc = new SecondClass();
		
		//fc.display("Nivangune");

	}

}
