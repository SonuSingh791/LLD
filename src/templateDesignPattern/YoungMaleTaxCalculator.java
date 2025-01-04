package templateDesignPattern;

public class YoungMaleTaxCalculator extends TexCalculator {

	@Override
	public int applyStandardDeduction(int income) {
		return income - 50000;
	}

	@Override
	public int applyTaxRate(int income) {
		return (int)(income * 0.2);
	}

	@Override
	public int applySurcharge(int tax) {
		return (int)(tax * 1.02);
	}

}
