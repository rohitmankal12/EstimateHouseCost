package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class aStandardTest {

	@Test
	public void test() {
		Estimate test=new Estimate();
		 int output=test.aStandard(10);
		 assertEquals(15000,output);
	}

}
