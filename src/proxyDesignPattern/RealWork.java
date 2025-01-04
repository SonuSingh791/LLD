package proxyDesignPattern;

public class RealWork implements ICalculate {

	@Override
	public int calculate(int r) {
		return (int)(Math.PI * r * r);
	}

}
