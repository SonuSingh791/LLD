package factoryDesignPattern.VehicalRentalSystem;

public class Car implements Vehicle {
	private final static int HOURLY_RATE = 100;
	private final static double DISCOUNT = 0.1;

	@Override
	public double rent(int duration) {
		// TODO Auto-generated method stub
		double cost = duration * HOURLY_RATE;
		
		if (duration >= 24) cost -= cost * DISCOUNT;
		
		return cost;
		
	}
	
}
