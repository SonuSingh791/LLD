package factoryDesignPattern.VehicalRentalSystem;

public class VehicleRentalFactory extends VehicleRental{

	@Override
	public Vehicle createVehicle(String type) {
		// TODO Auto-generated method stub
		switch(type.toLowerCase()) {
			case "Car":
				return new Car();
			case "Bike":
				return new Bike();
			case "Truck":
				return new Truck();
			default:
				return null;
		}
	}

}
