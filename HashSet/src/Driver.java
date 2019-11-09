import java.util.HashSet;

public class Driver {
	
	private class Name{
		int value;

		public Name(int value) {
			super();
			this.value = value;
		}
		
	}

	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<>();	
		s.add("10");
		s.add("21");
		s.add("16");
		s.add("18");
		System.out.println(s.size());
		System.out.println(s.contains(new String("10")));
		System.out.println(s.remove(new String("10")));
		System.out.println(s.size());
		
	}

}
