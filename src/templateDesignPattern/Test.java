package templateDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TexCalculator tcym = new YoungMaleTaxCalculator();
		TexCalculator tcsc = new SeniorCitizenTaxCalculator();
		System.out.println("tax = " + tcym.calculateTax(1000000));
		System.out.println("tax = " + tcsc.calculateTax(1000000));
	}

}
