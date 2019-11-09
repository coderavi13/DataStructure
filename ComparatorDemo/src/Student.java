public class Student{

	int roll;
	String fname;
	String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public Student(int roll, String fname, String lname) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
	