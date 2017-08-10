
public class CompoundInterest {
	
	public double compoundInterestCalculate(int var1, int var2, int var3) {
		double ci = var1 * Math.pow((1 + var2/100),var3);
		System.out.println("Compound Interest: " + var1 + "*Math.pow((1+" + var2 + "/100),"+ var3 +")");
		return ci;
	}
	
}
