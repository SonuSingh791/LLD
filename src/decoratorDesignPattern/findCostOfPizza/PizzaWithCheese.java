package decoratorDesignPattern.findCostOfPizza;

public class PizzaWithCheese extends PizzaDecorator {
	PizzaWithCheese(BasePizza pizza) {
		super(pizza);
	}
	public int cost() {
		return super.cost() + 10;
	}
}
