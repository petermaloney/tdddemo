package util;

import junit.framework.TestCase;

public class SimpleMathTest extends TestCase {
	public void testAdd() throws Exception {
		assertEquals(15, SimpleMath.add(5, 10));
		assertEquals(15, SimpleMath.add(10, 5));
		assertEquals(28, SimpleMath.add(-5, 33));
	}
}
