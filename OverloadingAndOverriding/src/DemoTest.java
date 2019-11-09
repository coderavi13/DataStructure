 import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		FirstClass fc=new FirstClass();
		
		assertEquals("RAVI",fc.display("RAVI"));
		//fail("Not yet implemented");
	}

}
