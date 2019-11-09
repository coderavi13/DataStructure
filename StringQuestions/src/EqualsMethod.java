
public class EqualsMethod {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println("***************************************************************");			
		
		StringBuffer s5= new StringBuffer("abc"); 
		StringBuffer s6= new StringBuffer("abc");
	
		System.out.println( s5==s6);
		System.out.println(s5.equals(s6));
		 
		
		System.out.println("***************************************************************");		
		StringBuilder s7 = new StringBuilder("abc");
		StringBuilder s8 = new StringBuilder("abc");
		
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
	
		System.out.println("***************************************************************");	
		String s3="abc";
		String s4="abc";

		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("***************************************************************");	
	   String s1 = "xyz";
	   String s2 = "x" + "yz";
	   
	   System.out.println(s1 == s2); // true
	   System.out.println(s1.equals(s2)); // true

		
		
		
	}

}
