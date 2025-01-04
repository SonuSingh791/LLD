package decoratorDesignPattern.findCostOfPizza;

public class PizzaWithMushroom extends PizzaDecorator {
	PizzaWithMushroom(BasePizza pizza) {
		super(pizza);
	}
	public int cost() {
		return super.cost() + 20;
	}
}
