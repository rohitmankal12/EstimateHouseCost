package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class hStandardTest {

	@Test
	public void test() {
		Estimate test=new Estimate();
		int output=test.hStandard(10);
		 assertEquals(18000,output);	
	}

}
