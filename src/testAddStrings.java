import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting junitstring = new jUnitTesting();
		String result = junitstring.addStrings("Hello ", "World");
		String result1 = junitstring.addStrings("Milestone ", "finish");
		assertEquals("Hello World", result);
		assertEquals("Milestone finished", result1);
	}

}
