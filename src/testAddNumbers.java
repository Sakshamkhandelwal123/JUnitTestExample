import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(100,300);
		assertEquals(400, result);
	}

}
