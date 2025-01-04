package templateDesignPattern;

// In this designPattern algorithms is same but the implementation of algorithms is different.
// for e.g taxCalculator is different for youngPerson, seniorCitizen, lady, according to that each class will extend this class and implement and 
// provide the body of applyStandardDeduction, applyTaxRate and applySurcharge.
public abstract class TexCalculator {
	// this is the algorithms which will be same for all the calculations
	public final int calculateTax(int inc) {
		int incAfterSD = applyStandardDeduction(inc); // standard deduction will apply on income
		int tax = applyTaxRate(incAfterSD);			// tax rate will apply one income after standard deduction
		int taxAfterSurcharge = applySurcharge(tax);	// surcharge will apply on tax.
		return taxAfterSurcharge;	
	}
	
	abstract public int applyStandardDeduction(int income);
	abstract public int applyTaxRate(int income);
	abstract public int applySurcharge(int tax);
}
