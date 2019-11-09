import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2=0;
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(2);
		l2.add(3);
		l2.add(4);
	
	for(int i=l.size()-1;i>=0;i--) {
		num1= (num1*10) +l.get(i);	
	}
	
	for(int i=l2.size()-1;i>=0;i--) {
		num2= (num2*10) +l2.get(i);	
	}
	
	System.out.println(num1 +num2);
	
		

	}

}
