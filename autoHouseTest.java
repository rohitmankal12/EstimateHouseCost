package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class autoHouseTest {

	@Test
	public void test() {
		Estimate test=new Estimate();
		int output=test.autoHouse(10);
		 assertEquals(25000,output);
		
	}

}
