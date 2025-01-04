package decoratorDesignPattern.findCostOfPizza;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePizza pizza = new Pizza1();
		BasePizza pizzaWithCheese = new PizzaWithCheese(pizza);
		System.out.println(pizzaWithCheese.cost());
		BasePizza pizzaWithCheeseAndChicken = new PizzaWithChicken(pizzaWithCheese);
		System.out.println(pizzaWithCheeseAndChicken.cost());
		BasePizza pizzaWithCheeseAndChickenAndMushroom = new PizzaWithMushroom(pizzaWithCheeseAndChicken);
		System.out.println(pizzaWithCheeseAndChickenAndMushroom.cost());
	}

}
