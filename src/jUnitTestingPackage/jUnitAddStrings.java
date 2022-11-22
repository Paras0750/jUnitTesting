package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitAddStrings {

	@Test
	public void test() {
//		fail("Not yet implemented");
		jUnitFunction jUnitString = new jUnitFunction();
		String result = jUnitString.addStrings("First String ", "Second String");
		
		assertEquals("First String Second String", result);
	}

}
