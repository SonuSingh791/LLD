package proxyDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculate area = new CalculateProxy();
		System.out.println(area.calculate(7));
		System.out.println(area.calculate(7));
		System.out.println(area.calculate(14));
	}

}
