package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class standardTest {

	@Test
	public void test() {
		Estimate test=new Estimate();
		 int output=test.standard(10);
		 assertEquals(12000,output);	
	}

}
