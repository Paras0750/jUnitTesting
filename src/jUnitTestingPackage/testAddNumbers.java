package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		
		jUnitFunction jUnit = new jUnitFunction();
		
		int result = jUnit.addNumbers(500, 200);
				
		assertEquals(700, result);
//		fail("Not yet implemented");
	}

}
