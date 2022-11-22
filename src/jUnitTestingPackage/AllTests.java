package jUnitTestingPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ jUnitAddStrings.class, testAddNumbers.class })
public class AllTests {

}
