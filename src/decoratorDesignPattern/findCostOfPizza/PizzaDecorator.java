package decoratorDesignPattern.findCostOfPizza;

public abstract class PizzaDecorator implements BasePizza {
	BasePizza pizza;
	PizzaDecorator(BasePizza pizza) {
		this.pizza = pizza;
	}
	
	public int cost() {
		return pizza.cost();
	}
}
