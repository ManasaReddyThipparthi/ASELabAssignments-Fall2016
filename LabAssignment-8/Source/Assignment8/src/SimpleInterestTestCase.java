import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTestCase {
	
	SimpleInterest SimpleInterest = new SimpleInterest();
	int si = SimpleInterest.simpleInterestCalculate(1000, 1, 1);
	int testSI = 10;

	@Test
	public void testSimpleInterest() {
		System.out.println("@Simple Interest: " + si + " = " + testSI);
		assertEquals(si, testSI);
	}

}
