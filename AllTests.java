package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ aStandardTest.class, autoHouseTest.class, hStandardTest.class,
		standardTest.class })
public class AllTests {

}
