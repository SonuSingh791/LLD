package decoratorDesignPattern.findCostOfPizza;

public class PizzaWithChicken extends PizzaDecorator {
	PizzaWithChicken(BasePizza pizza) {
		super(pizza);
	}
	public int cost() {
		return super.cost() + 30;
	}
}
