import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		
		Student s1=new Student(15,"Ravi","Nivangune");
		Student s2=new Student(10,"Anil","Choudhary");
		Student s3=new Student(13,"Shubham","Gogawale");
		
		List<Student> st=new ArrayList<>();
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		//Method 1 Lambda Expression
		/*Comparator<Student> com = (p1,p2)-> p1.roll -p2.roll;
		Collections.sort(st,com);
		*/
		
		//Method 2 Anonymous Class
		/*
		 * Collections.sort(st,new Comparator<Student>() { public int compare(Student
		 * p1,Student p2) { //return p1.roll -p2.roll; return
		 * p1.fname.compareTo(p2.fname); } });
		 */
		
		Comparator cm=Comparator.comparing(Student::getFname);
		
		Collections.sort(st,cm);
		
		st.forEach(System.out::println);// Stream API ... Lambda Expression
	}

}
