import java.util.*;
public class List {

	public static void main(String[] args) {

		
	 ArrayList<Integer> list =new ArrayList<Integer>();
	 list.add(10);
	 list.add(2);
	 list.add(2);
	 list.add(4);
	 list.add(5);
	 
	/* ArrayList<Integer> list1 =new ArrayList<Integer>();
	 list1.add(1);
	 list1.add(2);
	 list.removeAll(list1);*/
	 
	 System.out.println("Index of 2 is : "+list.indexOf(2));
	 System.out.println("Last Index of 2 is : "+list.lastIndexOf(2));
Collections.sort(list);
	// ListIterator itr=list.listIterator(2);  
	// while(itr.hasNext()){  
	// System.out.println(itr.next());  
	//itr.remove();
	//}
	 
	 System.out.println(list.isEmpty());
	 Iterator itr1=list.iterator();  
	 while(itr1.hasNext()){  
	 System.out.println(itr1.next());  
		//itr.remove();
	}
	}
}
