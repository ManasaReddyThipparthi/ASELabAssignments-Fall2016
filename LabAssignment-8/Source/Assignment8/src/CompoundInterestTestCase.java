import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTestCase {
	
	CompoundInterest CompoundInterest = new CompoundInterest();
	int ci = (int) CompoundInterest.compoundInterestCalculate(1000, 1, 1);
	int testCI = 100;

	@Test
	public void testCompoundInterest() {
		System.out.println("@Simple Interest: " + ci + " = " + testCI);
		assertEquals(ci, testCI);
	}

}
